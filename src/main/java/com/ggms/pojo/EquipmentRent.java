package com.ggms.pojo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class EquipmentRent implements Serializable {
    private Integer equipmentRentid;

    private Integer equipmentApplicationid;

    private Integer eractualtime;

    private Integer erbreaknum;

    private static final long serialVersionUID = 1L;

    public Integer getEquipmentRentid() {
        return equipmentRentid;
    }

    public void setEquipmentRentid(Integer equipmentRentid) {
        this.equipmentRentid = equipmentRentid;
    }

    public Integer getEquipmentApplicationid() {
        return equipmentApplicationid;
    }

    public void setEquipmentApplicationid(Integer equipmentApplicationid) {
        this.equipmentApplicationid = equipmentApplicationid;
    }

    public Integer getEractualtime() {
        return eractualtime;
    }

    public void setEractualtime(Integer eractualtime) {
        this.eractualtime = eractualtime;
    }

    public Integer getErbreaknum() {
        return erbreaknum;
    }

    public void setErbreaknum(Integer erbreaknum) {
        this.erbreaknum = erbreaknum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", equipmentRentid=").append(equipmentRentid);
        sb.append(", equipmentApplicationid=").append(equipmentApplicationid);
        sb.append(", eractualtime=").append(eractualtime);
        sb.append(", erbreaknum=").append(erbreaknum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}