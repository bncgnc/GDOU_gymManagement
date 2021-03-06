package com.ggms.service.impl;

import com.ggms.mapper.CompetitionMapper;
import com.ggms.mapper.EquipmentApplicationMapper;
import com.ggms.mapper.FieldApplicationMapper;
import com.ggms.mapper.UserMapper;
import com.ggms.pojo.*;
import com.ggms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //用于删除userid外键
    @Autowired
    private EquipmentApplicationMapper equipmentApplicationMapper;
    @Autowired
    private FieldApplicationMapper fieldApplicationMapper;
    @Autowired
    private CompetitionMapper competitionMapper;

    @Override
    public List<User> findAllUser(UserExample example) {
        return userMapper.selectByExample(example);
    }

    //模糊查询
    @Override
    public List<User> fuzzyFindUser(String selectExample) {
        UserExample example = new UserExample();

        example.or().andUseridLike("%" + selectExample + "%");
        example.or().andUnameLike("%" + selectExample + "%");
        example.or().andUphoneLike("%" + selectExample + "%");
        example.or().andUunitLike("%" + selectExample + "%");

        List<User> users = userMapper.selectByExample(example);

        if( users.size() > 0) {
            return users;
        } else {
            return null;
        }
    }

    @Override
    public User login(String userid, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        criteria.andUpasswordEqualTo(password);

        List<User> users = userMapper.selectByExample(example);

        if( users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    @Override
    public void register(User user) {
        user.setUtype(0); //设置用户类型为普通用户
        user.setUcredit(3); //设置用户信誉
        userMapper.insert(user);
    }

    @Override
    public User findUserById(String userid) {
        return userMapper.selectByPrimaryKey(userid);
    }

    @Override
    public int insertUser(User record) {
        record.setUcredit(3);
        return userMapper.insert(record);
    }

    @Override
    public int deleteUserById(String userid) {
        FieldApplicationExample fieldApplicationExample = new FieldApplicationExample();
        EquipmentApplicationExample equipmentApplicationExample = new EquipmentApplicationExample();

        FieldApplicationExample.Criteria criteria1 = fieldApplicationExample.createCriteria();
        EquipmentApplicationExample.Criteria criteria2 = equipmentApplicationExample.createCriteria();

        criteria1.andUseridEqualTo(userid);
        fieldApplicationMapper.deleteByExample(fieldApplicationExample);

        criteria2.andUseridEqualTo(userid);
        equipmentApplicationMapper.deleteByExample(equipmentApplicationExample);

        return userMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public void updateUser(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();

        criteria.andUseridEqualTo(user.getUserid());

        userMapper.updateByExample(user , example);
    }

    @Override
    public List<SimpleCompetition> getApplicationCompetition(String userid) {
        return userMapper.getApplicationCompetition(userid);
    }

    @Override
    public List<SimpleField> getApplicationField(String userid) {
        return userMapper.getApplicationField(userid);
    }

    @Override
    public List<SimpleEquipment> getApplicationEquipment(String userid) {
        return userMapper.getApplicationEquipment(userid);
    }

    @Override
    public int deleteApplicateField(Integer applicationid) {
        CompetitionExample example = new CompetitionExample();
        CompetitionExample.Criteria criteria = example.createCriteria();
        criteria.andFieldApplicationidEqualTo(applicationid);
        List<Competition> list= competitionMapper.selectByExample(example);
        if (list.size()>0){
            //已经有比赛用这个场地
            return 0;
        }
        else{
            fieldApplicationMapper.deleteByPrimaryKey(applicationid);
            return 1;
        }
    }

    @Override
    public int deleteApplicateEquipment(Integer applicationid) {
        CompetitionExample example = new CompetitionExample();
        CompetitionExample.Criteria criteria = example.createCriteria();
        criteria.andEquipmentApplicationidEqualTo(applicationid);
        List<Competition> list= competitionMapper.selectByExample(example);
        if (list.size()>0){
            //已经有比赛用这个器材
            return 0;
        }
        else{
            equipmentApplicationMapper.deleteByPrimaryKey(applicationid);
            return 1;
        }
    }

    @Override
    public int deleteApplicateCompetition(Integer applicationid) {
        return competitionMapper.deleteByPrimaryKey(applicationid);
    }
}
