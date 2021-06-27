package com.ggms.mapper;

import com.ggms.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    public List<SimpleCompetition> getApplicationCompetition(@Param("userid") String userid);

    public List<SimpleField> getApplicationField(@Param("userid") String userid);

    public List<SimpleEquipment> getApplicationEquipment(@Param("userid") String userid);
}