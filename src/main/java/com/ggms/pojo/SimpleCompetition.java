package com.ggms.pojo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Repository
public class SimpleCompetition implements Serializable {
    private String fname;

    private Time start;

    private Time end;

    private Integer competitionid;

    private String equipmentname;

    private String competitionname;

    private String judgename;

    private Integer isPermit;

    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getIsPermit() {
        return isPermit;
    }

    public void setIsPermit(Integer isPermit) {
        this.isPermit = isPermit;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    public Integer getCompetitionid() {
        return competitionid;
    }

    public void setCompetitionid(Integer competitionid) {
        this.competitionid = competitionid;
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname;
    }

    public String getCompetitionname() {
        return competitionname;
    }

    public void setCompetitionname(String competitionname) {
        this.competitionname = competitionname;
    }

    public String getJudgename() {
        return judgename;
    }

    public void setJudgename(String judgename) {
        this.judgename = judgename;
    }
}
