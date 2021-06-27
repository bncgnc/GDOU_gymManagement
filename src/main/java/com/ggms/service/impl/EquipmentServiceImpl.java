package com.ggms.service.impl;

import com.ggms.mapper.EquipmentApplicationMapper;
import com.ggms.mapper.EquipmentMapper;
import com.ggms.mapper.EquipmentRentMapper;
import com.ggms.pojo.Equipment;
import com.ggms.pojo.EquipmentApplication;
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
    @Autowired
    EquipmentApplicationMapper equipmentApplicationMapper;
    @Autowired
    EquipmentRentMapper equipmentRentMapper;
    @Override
    public List<Equipment> getEquipments(EquipmentExample equipmentExample) {
        return equipmentMapper.selectByExample(equipmentExample);
    }

    @Override
    public Equipment getEquipment(Integer id) {
        return equipmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int doApplication(Integer equipmentid, Integer num, Integer time ,String userid) {
        EquipmentApplication equipmentApplication = new EquipmentApplication();
        equipmentApplication.setEanum(num);
        equipmentApplication.setEapermit(0);
        equipmentApplication.setEaplantime(time);
        equipmentApplication.setUserid(userid);
        equipmentApplication.setEquipmentid(equipmentid);
        return equipmentApplicationMapper.insert(equipmentApplication);
    }

    @Override
    public Integer getCanRent(Integer eid) {
        return equipmentRentMapper.getCanRent(eid);
    }

    @Override
    public int changeApplication(Integer eapid, Integer equipmentid, Integer num, Integer time, String userid) {
        EquipmentApplication equipmentApplication = new EquipmentApplication();
        equipmentApplication.setEquipmentApplicationid(eapid);
        equipmentApplication.setEanum(num);
        equipmentApplication.setEapermit(0);
        equipmentApplication.setEaplantime(time);
        equipmentApplication.setUserid(userid);
        equipmentApplication.setEquipmentid(equipmentid);
        return equipmentApplicationMapper.updateByPrimaryKey(equipmentApplication);
    }

    @Override
    public int deleteApplication(Integer equipmentid) {
        return equipmentApplicationMapper.deleteByPrimaryKey(equipmentid);
    }
}
