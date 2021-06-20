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
    public int addUser(User record) {
        return userMapper.insert(record);
    }
}
