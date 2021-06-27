package com.ggms.service;

import com.ggms.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    public List<User> findAllUser(UserExample example);

    public List<User> fuzzyFindUser(String selectExample);

    public User login(String userid , String password);

    public void register(User user);

    public User findUserById(String userid);

    public int insertUser(User record);

    public int deleteUserById(String userid);

    public void updateUser(User user);

    public List<SimpleCompetition> getApplicationCompetition(String userid);

    public List<SimpleField> getApplicationField(String userid);

    public List<SimpleEquipment> getApplicationEquipment(String userid);

    int deleteApplicateField(Integer applicationid);

    int deleteApplicateEquipment(Integer applicationid);

    int deleteApplicateCompetition(Integer applicationid);
}
