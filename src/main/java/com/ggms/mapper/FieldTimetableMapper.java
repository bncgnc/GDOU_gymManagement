package com.ggms.mapper;

import com.ggms.pojo.FieldTimetable;
import com.ggms.pojo.FieldTimetableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FieldTimetableMapper {
    long countByExample(FieldTimetableExample example);

    int deleteByExample(FieldTimetableExample example);

    int deleteByPrimaryKey(Integer fieldTimetableid);

    int insert(FieldTimetable record);

    int insertSelective(FieldTimetable record);

    List<FieldTimetable> selectByExample(FieldTimetableExample example);

    FieldTimetable selectByPrimaryKey(Integer fieldTimetableid);

    int updateByExampleSelective(@Param("record") FieldTimetable record, @Param("example") FieldTimetableExample example);

    int updateByExample(@Param("record") FieldTimetable record, @Param("example") FieldTimetableExample example);

    int updateByPrimaryKeySelective(FieldTimetable record);

    int updateByPrimaryKey(FieldTimetable record);
}