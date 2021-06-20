package com.ggms.mapper;

import com.ggms.pojo.EquipmentRent;
import com.ggms.pojo.EquipmentRentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRentMapper {
    long countByExample(EquipmentRentExample example);

    int deleteByExample(EquipmentRentExample example);

    int deleteByPrimaryKey(Integer equipmentRentid);

    int insert(EquipmentRent record);

    int insertSelective(EquipmentRent record);

    List<EquipmentRent> selectByExample(EquipmentRentExample example);

    EquipmentRent selectByPrimaryKey(Integer equipmentRentid);

    int updateByExampleSelective(@Param("record") EquipmentRent record, @Param("example") EquipmentRentExample example);

    int updateByExample(@Param("record") EquipmentRent record, @Param("example") EquipmentRentExample example);

    int updateByPrimaryKeySelective(EquipmentRent record);

    int updateByPrimaryKey(EquipmentRent record);
}