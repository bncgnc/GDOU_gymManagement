package com.ggms.service.impl;

import com.ggms.mapper.CompetitionMapper;
import com.ggms.mapper.EquipmentApplicationMapper;
import com.ggms.mapper.EquipmentMapper;
import com.ggms.mapper.EquipmentRentMapper;
import com.ggms.pojo.*;
import com.ggms.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {
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
}
