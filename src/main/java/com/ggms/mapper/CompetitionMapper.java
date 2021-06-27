package com.ggms.mapper;

import com.ggms.pojo.Competition;
import com.ggms.pojo.CompetitionExample;
import com.ggms.pojo.SimpleEquipment;
import com.ggms.pojo.SimpleField;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompetitionMapper {
    long countByExample(CompetitionExample example);

    int deleteByExample(CompetitionExample example);

    int deleteByPrimaryKey(Integer competitionid);

    int insert(Competition record);

    int insertSelective(Competition record);

    List<Competition> selectByExample(CompetitionExample example);

    Competition selectByPrimaryKey(Integer competitionid);

    int updateByExampleSelective(@Param("record") Competition record, @Param("example") CompetitionExample example);

    int updateByExample(@Param("record") Competition record, @Param("example") CompetitionExample example);

    int updateByPrimaryKeySelective(Competition record);

    int updateByPrimaryKey(Competition record);

    List<SimpleField> getPermitedField(String userid);

    List<SimpleEquipment> getPermitEquipment(@Param("userid") String userid);
}