package com.ggms.pojo;

import java.io.Serializable;

public class EquipmentApplication implements Serializable {
    private Integer equipmentApplicationid;

    private Integer equipmentid;

    private String userid;

    private Integer eanum;

    private Integer eaplantime;

    private Integer eapermit;

    private static final long serialVersionUID = 1L;

    public Integer getEquipmentApplicationid() {
        return equipmentApplicationid;
    }

    public void setEquipmentApplicationid(Integer equipmentApplicationid) {
        this.equipmentApplicationid = equipmentApplicationid;
    }

    public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getEanum() {
        return eanum;
    }

    public void setEanum(Integer eanum) {
        this.eanum = eanum;
    }

    public Integer getEaplantime() {
        return eaplantime;
    }

    public void setEaplantime(Integer eaplantime) {
        this.eaplantime = eaplantime;
    }

    public Integer getEapermit() {
        return eapermit;
    }

    public void setEapermit(Integer eapermit) {
        this.eapermit = eapermit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", equipmentApplicationid=").append(equipmentApplicationid);
        sb.append(", equipmentid=").append(equipmentid);
        sb.append(", userid=").append(userid);
        sb.append(", eanum=").append(eanum);
        sb.append(", eaplantime=").append(eaplantime);
        sb.append(", eapermit=").append(eapermit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}