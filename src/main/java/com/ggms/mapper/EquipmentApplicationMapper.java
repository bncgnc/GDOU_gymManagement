package com.ggms.mapper;

import com.ggms.pojo.EquipmentApplication;
import com.ggms.pojo.EquipmentApplicationExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentApplicationMapper {
    long countByExample(EquipmentApplicationExample example);

    int deleteByExample(EquipmentApplicationExample example);

    int deleteByPrimaryKey(Integer equipmentApplicationid);

    int insert(EquipmentApplication record);

    int insertSelective(EquipmentApplication record);

    List<EquipmentApplication> selectByExample(EquipmentApplicationExample example);

    EquipmentApplication selectByPrimaryKey(Integer equipmentApplicationid);

    int updateByExampleSelective(@Param("record") EquipmentApplication record, @Param("example") EquipmentApplicationExample example);

    int updateByExample(@Param("record") EquipmentApplication record, @Param("example") EquipmentApplicationExample example);

    int updateByPrimaryKeySelective(EquipmentApplication record);

    int updateByPrimaryKey(EquipmentApplication record);
}