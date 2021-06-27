package com.ggms.pojo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class SimpleEquipment implements Serializable {
    private Integer equipmentApplicationid;

    private Integer equipmentid;

    private String userid;

    private Integer eanum;

    private Integer eaplantime;

    private Integer eapermit;

    private String ename;

    private Integer enums;

    private Integer erent;

    private Integer ebreakprice;



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

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getEnums() {
        return enums;
    }

    public void setEnums(Integer enums) {
        this.enums = enums;
    }

    public Integer getErent() {
        return erent;
    }

    public void setErent(Integer erent) {
        this.erent = erent;
    }

    public Integer getEbreakprice() {
        return ebreakprice;
    }

    public void setEbreakprice(Integer ebreakprice) {
        this.ebreakprice = ebreakprice;
    }
}
