package com.ggms.service.impl;

import com.ggms.mapper.UserMapper;
import com.ggms.pojo.User;
import com.ggms.pojo.UserExample;
import com.ggms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser(UserExample example) {
        return userMapper.selectByExample(example);
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
        return userMapper.insert(record);
    }
}
