package com.ggms.mapper;

import com.ggms.pojo.FieldApplication;
import com.ggms.pojo.FieldApplicationExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FieldApplicationMapper {
    long countByExample(FieldApplicationExample example);

    int deleteByExample(FieldApplicationExample example);

    int deleteByPrimaryKey(Integer fieldApplicationid);

    int insert(FieldApplication record);

    int insertSelective(FieldApplication record);

    List<FieldApplication> selectByExample(FieldApplicationExample example);

    FieldApplication selectByPrimaryKey(Integer fieldApplicationid);

    int updateByExampleSelective(@Param("record") FieldApplication record, @Param("example") FieldApplicationExample example);

    int updateByExample(@Param("record") FieldApplication record, @Param("example") FieldApplicationExample example);

    int updateByPrimaryKeySelective(FieldApplication record);

    int updateByPrimaryKey(FieldApplication record);

    @Select("select a.field_timetableid from field_timetable as a inner join field_application as b on a.field_timetableid=b.field_timetableid where fieldid=#{fieldid} and fapdate= #{date}")
    List<Integer> selectDisableTimes(@Param("fieldid") Integer fieldid,@Param("date") String date);

    int doApplication(@Param("userid") String userid,@Param("fieldid") Integer fieldid,@Param("date") String date,@Param("time") List<Integer> time);
}