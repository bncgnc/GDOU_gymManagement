package com.ggms.service;

import com.ggms.pojo.*;

import java.util.List;
import java.util.Map;

public interface EquipmentService {
    public List<Equipment> getEquipments(EquipmentExample equipmentExample);

    public Equipment getEquipment(Integer id);

    int doApplication(Integer equipmentid, Integer num, Integer time,String userid);

    Integer getCanRent(Integer eid);

    public int changeApplication(Integer eapid,Integer equipmentid, Integer num, Integer time,String userid);

    public EquipmentApplication getEquipmentApplication(Integer id);

    public int deleteApplication(Integer equipmentid);

    void updateEquipmentApplication(Integer applicationid, Integer num, Integer time);


    public List<Equipment> fuzzyFindEquipment(String selectExample);

    public int insertEquipment(Equipment equipment);

    public void updateEquipment(Equipment equipment);

    public int deleteEquipment(Integer equipmentId);

    public List<EquipmentApplication> findAllEquipmentApplication(EquipmentApplicationExample example);

    public Map<String , User> findApplicant(List<EquipmentApplication> equipmentApplications);

    public List<EquipmentApplication> fuzzyFindEquipmentApplication(String selectExample);

    public void equipmentApplicationPermit(Integer equipmentApplicationId);

    public void equipmentApplicationRefuse(Integer equipmentApplicationId);

    public List<EquipmentRent> findAllEquipmentRent(EquipmentRentExample equipmentRentExample);

    public int insertEquipmentRent(EquipmentRent equipmentRent);

    public int deleteEquipmentRent(Integer equipmentRentId);
}
