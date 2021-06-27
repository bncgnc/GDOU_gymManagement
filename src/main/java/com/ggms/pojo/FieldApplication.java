package com.ggms.pojo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.Date;

@Repository
public class FieldApplication implements Serializable {
    private Integer fieldApplicationid;

    private Integer fieldTimetableid;

    private String userid;

    private Integer fapermit;

    private Integer fapaid;

    private String fapdate;

    private static final long serialVersionUID = 1L;

    public Integer getFieldApplicationid() {
        return fieldApplicationid;
    }

    public void setFieldApplicationid(Integer fieldApplicationid) {
        this.fieldApplicationid = fieldApplicationid;
    }

    public Integer getFieldTimetableid() {
        return fieldTimetableid;
    }

    public void setFieldTimetableid(Integer fieldTimetableid) {
        this.fieldTimetableid = fieldTimetableid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getFapermit() {
        return fapermit;
    }

    public void setFapermit(Integer fapermit) {
        this.fapermit = fapermit;
    }

    public Integer getFapaid() {
        return fapaid;
    }

    public void setFapaid(Integer fapaid) {
        this.fapaid = fapaid;
    }

    public String getFapdate() {
        return fapdate;
    }

    public void setFapdate(String fapdate) {
        this.fapdate = fapdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fieldApplicationid=").append(fieldApplicationid);
        sb.append(", fieldTimetableid=").append(fieldTimetableid);
        sb.append(", userid=").append(userid);
        sb.append(", fapermit=").append(fapermit);
        sb.append(", fapaid=").append(fapaid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}