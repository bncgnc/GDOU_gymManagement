package com.ggms.service;

import com.ggms.pojo.User;
import com.ggms.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    public List<User> findAllUser(UserExample example);

    public User login(String userid , String password);

    public void register(User user);

    public User findUserById(String userid);

    public int insertUser(User record);
}
