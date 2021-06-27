package com.ggms.service;

import com.ggms.pojo.*;

import java.util.List;

public interface EquipmentService {
    public List<Equipment> getEquipments(EquipmentExample equipmentExample);

    public Equipment getEquipment(Integer id);

    int doApplication(Integer equipmentid, Integer num, Integer time,String userid);

    Integer getCanRent(Integer eid);

    public int changeApplication(Integer eapid,Integer equipmentid, Integer num, Integer time,String userid);

    public EquipmentApplication getEquipmentApplication(Integer id);

    public int deleteApplication(Integer equipmentid);

    void updateEquipmentApplication(Integer applicationid, Integer num, Integer time);
}
