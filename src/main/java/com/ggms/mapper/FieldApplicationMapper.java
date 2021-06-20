package com.ggms.mapper;

import com.ggms.pojo.FieldApplication;
import com.ggms.pojo.FieldApplicationExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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
}