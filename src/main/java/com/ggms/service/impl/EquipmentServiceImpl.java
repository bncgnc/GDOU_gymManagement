package com.ggms.service.impl;

import com.ggms.mapper.EquipmentMapper;
import com.ggms.pojo.Equipment;
import com.ggms.pojo.EquipmentExample;
import com.ggms.pojo.Field;
import com.ggms.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    EquipmentMapper equipmentMapper;
    @Override
    public List<Equipment> getEquipments(EquipmentExample equipmentExample) {
        return equipmentMapper.selectByExample(equipmentExample);
    }

    @Override
    public Equipment getEquipment(Integer id) {
        return equipmentMapper.selectByPrimaryKey(id);
    }
}
