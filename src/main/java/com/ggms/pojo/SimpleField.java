package com.ggms.pojo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.Time;

@Repository
public class SimpleField implements Serializable {
    private Integer fieldTimetableid;

    private Integer fieldid;

    private String fname;

    private String fapdate;

    private Integer fapermit;

    private Time fdtimeStart;

    private Time fdtimeEnd;

    private Integer fieldApplicationid;

    private Integer isPermit;

    private String fHostCall;

    private Integer frent;

    public Integer getFrent() {
        return frent;
    }

    public void setFrent(Integer frent) {
        this.frent = frent;
    }

    public String getfHostCall() {
        return fHostCall;
    }

    public void setfHostCall(String fHostCall) {
        this.fHostCall = fHostCall;
    }

    public Integer getIsPermit() {
        return isPermit;
    }

    public void setIsPermit(Integer isPermit) {
        this.isPermit = isPermit;
    }

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

    public Integer getFieldid() {
        return fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFapdate() {
        return fapdate;
    }

    public void setFapdate(String fapdate) {
        this.fapdate = fapdate;
    }

    public Integer getFapermit() {
        return fapermit;
    }

    public void setFapermit(Integer fapermit) {
        this.fapermit = fapermit;
    }

    public Time getFdtimeStart() {
        return fdtimeStart;
    }

    public void setFdtimeStart(Time fdtimeStart) {
        this.fdtimeStart = fdtimeStart;
    }

    public Time getFdtimeEnd() {
        return fdtimeEnd;
    }

    public void setFdtimeEnd(Time fdtimeEnd) {
        this.fdtimeEnd = fdtimeEnd;
    }
}
