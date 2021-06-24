package com.ggms.service;

import com.ggms.pojo.Equipment;
import com.ggms.pojo.EquipmentExample;
import com.ggms.pojo.Field;
import com.ggms.pojo.FieldExample;

import java.util.List;

public interface EquipmentService {
    public List<Equipment> getEquipments(EquipmentExample equipmentExample);

    public Equipment getEquipment(Integer id);
}
