package com.ggms.service.impl;

import com.ggms.mapper.*;
import com.ggms.pojo.*;
import com.ggms.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    EquipmentMapper equipmentMapper;
    @Autowired
    EquipmentApplicationMapper equipmentApplicationMapper;
    @Autowired
    EquipmentRentMapper equipmentRentMapper;
    @Autowired
    CompetitionMapper competitionMapper;
    @Override
    public List<Equipment> getEquipments(EquipmentExample equipmentExample) {
        return equipmentMapper.selectByExample(equipmentExample);
    }

    @Override
    public Equipment getEquipment(Integer id) {
        return equipmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int doApplication(Integer equipmentid, Integer num, Integer time ,String userid) {
        EquipmentApplication equipmentApplication = new EquipmentApplication();
        equipmentApplication.setEanum(num);
        equipmentApplication.setEapermit(0);
        equipmentApplication.setEaplantime(time);
        equipmentApplication.setUserid(userid);
        equipmentApplication.setEquipmentid(equipmentid);
        return equipmentApplicationMapper.insert(equipmentApplication);
    }

    @Override
    public Integer getCanRent(Integer eid) {
        return equipmentRentMapper.getCanRent(eid);
    }

    @Override
    public int changeApplication(Integer eapid, Integer equipmentid, Integer num, Integer time, String userid) {
        EquipmentApplication equipmentApplication = new EquipmentApplication();
        equipmentApplication.setEquipmentApplicationid(eapid);
        equipmentApplication.setEanum(num);
        equipmentApplication.setEapermit(0);
        equipmentApplication.setEaplantime(time);
        equipmentApplication.setUserid(userid);
        equipmentApplication.setEquipmentid(equipmentid);
        return equipmentApplicationMapper.updateByPrimaryKey(equipmentApplication);
    }

    @Override
    public EquipmentApplication getEquipmentApplication(Integer id) {
        return equipmentApplicationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteApplication(Integer equipmentid) {
        return equipmentApplicationMapper.deleteByPrimaryKey(equipmentid);
    }

    @Override
    public void updateEquipmentApplication(Integer applicationid, Integer num, Integer time) {
        //若修改器材，对应的赛事审核状态改变
        CompetitionExample example = new CompetitionExample();
        CompetitionExample.Criteria criteria= example.createCriteria();
        criteria.andEquipmentApplicationidEqualTo(applicationid);
        Competition competition = new Competition();
        competition.setCapermit(0);
        competitionMapper.updateByExampleSelective(competition,example);

        EquipmentApplication equipmentApplication = new EquipmentApplication();
        equipmentApplication.setEapermit(0);
        equipmentApplication.setEanum(num);
        equipmentApplication.setEaplantime(time);
        equipmentApplication.setEquipmentApplicationid(applicationid);
        equipmentApplicationMapper.updateByPrimaryKeySelective(equipmentApplication);
    }



    @Override
    public List<Equipment> fuzzyFindEquipment(String selectExample) {
        EquipmentExample equipmentExample = new EquipmentExample();

        equipmentExample.or().andEnameLike("%" + selectExample + "%");

        try{
            Integer integer = Integer.valueOf(selectExample);
            equipmentExample.or().andenumsLessThan(integer);
            equipmentExample.or().andErentLessThan(integer);
            equipmentExample.or().andEbreakpriceLessThan(integer);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("can't convert to int");
        } finally {
            List<Equipment> equipments = equipmentMapper.selectByExample(equipmentExample);
            if( equipments.size() > 0 ){
                return equipments;
            }else {
                return null;
            }
        }
    }

    @Override
    public int insertEquipment(Equipment equipment) {
        return equipmentMapper.insert(equipment);
    }

    @Override
    public void updateEquipment(Equipment equipment) {
        EquipmentExample equipmentExample = new EquipmentExample();
        EquipmentExample.Criteria criteria = equipmentExample.createCriteria();

        criteria.andEquipmentidEqualTo(equipment.getEquipmentid());

        equipmentMapper.updateByExample(equipment , equipmentExample);
    }

    @Override
    public int deleteEquipment(Integer equipmentId) {
        EquipmentApplicationExample equipmentApplicationExample = new EquipmentApplicationExample();
        EquipmentRentExample equipmentRentExample = new EquipmentRentExample();

        EquipmentApplicationExample.Criteria criteria1 = equipmentApplicationExample.createCriteria();
        EquipmentRentExample.Criteria criteria2 = equipmentRentExample.createCriteria();

        criteria1.andEquipmentidEqualTo(equipmentId);

        //获取对应器材的申请
        List<EquipmentApplication> equipmentApplications = equipmentApplicationMapper.selectByExample(equipmentApplicationExample);

        for(int i = 0 ; i < equipmentApplications.size() ; i++) {
            Integer equipmentApplicationid = equipmentApplications.get(i).getEquipmentApplicationid();
            criteria2.andEquipmentApplicationidEqualTo(equipmentApplicationid);
        }
        equipmentRentMapper.deleteByExample(equipmentRentExample);
        equipmentApplicationMapper.deleteByExample(equipmentApplicationExample);

        return equipmentMapper.deleteByPrimaryKey(equipmentId);
    }

    @Override
    public List<EquipmentApplication> findAllEquipmentApplication(EquipmentApplicationExample example) {
        return equipmentApplicationMapper.selectByExample(example);
    }

    @Override
    public Map<String, User> findApplicant(List<EquipmentApplication> equipmentApplications) {
        Map<String, User> userMap = new HashMap<>();
        for(int i = 0 ; i < equipmentApplications.size() ; i++) {
            String userid = equipmentApplications.get(i).getUserid();
            User curUser = userMapper.selectByPrimaryKey(userid);
            userMap.put(userid , curUser);
        }
        return userMap;
    }

    @Override
    public List<EquipmentApplication> fuzzyFindEquipmentApplication(String selectExample) {
        EquipmentApplicationExample equipmentApplicationExample = new EquipmentApplicationExample();

        equipmentApplicationExample.or().andUseridLike("%" + selectExample + "%");

        if( "未审核".equals(selectExample) ){
            equipmentApplicationExample.or().andEapermitEqualTo(0);
        } else if( "申请通过".equals(selectExample) ) {
            equipmentApplicationExample.or().andEapermitEqualTo(1);
        } else if( "申请驳回".equals(selectExample) ) {
            equipmentApplicationExample.or().andEapermitEqualTo(2);
        }

        try{
            Integer integer = Integer.valueOf(selectExample);
            equipmentApplicationExample.or().andEanumLessThan(integer);
            equipmentApplicationExample.or().andEaplantimeLessThan(integer);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("can't convert to int");
        } finally {
            List<EquipmentApplication> equipmentApplications = equipmentApplicationMapper.selectByExample(equipmentApplicationExample);
            if( equipmentApplications.size() > 0 ){
                return equipmentApplications;
            }else {
                return null;
            }
        }
    }

    @Override
    public void equipmentApplicationPermit(Integer equipmentApplicationId) {
        EquipmentApplication equipmentApplication = equipmentApplicationMapper.selectByPrimaryKey(equipmentApplicationId);

        Equipment equipment = equipmentMapper.selectByPrimaryKey(equipmentApplication.getEquipmentid());

        int restNum = equipment.getenums() - equipmentApplication.getEanum();
        if( restNum >= 0 ) {
            equipmentApplication.setEapermit(1);
            equipment.setenums(restNum);
            equipmentMapper.updateByPrimaryKey(equipment);
            equipmentApplicationMapper.updateByPrimaryKey(equipmentApplication);
        }

    }

    @Override
    public void equipmentApplicationRefuse(Integer equipmentApplicationId) {
        EquipmentApplication equipmentApplication = equipmentApplicationMapper.selectByPrimaryKey(equipmentApplicationId);

        equipmentApplication.setEapermit(2);
        equipmentApplicationMapper.updateByPrimaryKey(equipmentApplication);
    }

    @Override
    public List<EquipmentRent> findAllEquipmentRent(EquipmentRentExample equipmentRentExample) {
        return equipmentRentMapper.selectByExample(equipmentRentExample);
    }

    @Override
    public int insertEquipmentRent(EquipmentRent equipmentRent) {
        return equipmentRentMapper.insert(equipmentRent);
    }

    @Override
    public int deleteEquipmentRent(Integer equipmentRentId) {
        return equipmentRentMapper.deleteByPrimaryKey(equipmentRentId);
    }


}
