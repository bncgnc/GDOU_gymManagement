package com.ggms.pojo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class Competition implements Serializable {
    private Integer competitionid;

    private String cname;

    private String cjudge;

    private Integer fieldApplicationid;

    private Integer equipmentApplicationid;

    private Integer capermit;


    public Integer getCapermit() {
        return capermit;
    }

    public void setCapermit(Integer capermit) {
        this.capermit = capermit;
    }

    private static final long serialVersionUID = 1L;

    public Integer getCompetitionid() {
        return competitionid;
    }

    public void setCompetitionid(Integer competitionid) {
        this.competitionid = competitionid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCjudge() {
        return cjudge;
    }

    public void setCjudge(String cjudge) {
        this.cjudge = cjudge;
    }

    public Integer getFieldApplicationid() {
        return fieldApplicationid;
    }

    public void setFieldApplicationid(Integer fieldApplicationid) {
        this.fieldApplicationid = fieldApplicationid;
    }

    public Integer getEquipmentApplicationid() {
        return equipmentApplicationid;
    }

    public void setEquipmentApplicationid(Integer equipmentApplicationid) {
        this.equipmentApplicationid = equipmentApplicationid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", competitionid=").append(competitionid);
        sb.append(", cname=").append(cname);
        sb.append(", cjudge=").append(cjudge);
        sb.append(", fieldApplicationid=").append(fieldApplicationid);
        sb.append(", equipmentApplicationid=").append(equipmentApplicationid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}