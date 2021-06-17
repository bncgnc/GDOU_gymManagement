package com.ggms.pojo;

import java.io.Serializable;

public class Equipment implements Serializable {
    private Integer equipmentid;

    private String ename;

    private Integer enums;

    private Integer erent;

    private Integer ebreakprice;

    private static final long serialVersionUID = 1L;

    public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getenums() {
        return enums;
    }

    public void setenums(Integer enums) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", equipmentid=").append(equipmentid);
        sb.append(", ename=").append(ename);
        sb.append(", enums=").append(enums);
        sb.append(", erent=").append(erent);
        sb.append(", ebreakprice=").append(ebreakprice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}