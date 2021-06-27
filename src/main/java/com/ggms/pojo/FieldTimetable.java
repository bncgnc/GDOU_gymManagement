package com.ggms.pojo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.Time;

@Repository
public class FieldTimetable implements Serializable {
    private Integer fieldTimetableid;

    private Integer fieldid;

    private Time fdtimeStart;

    private Time fdtimeEnd;

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fieldTimetableid=").append(fieldTimetableid);
        sb.append(", fieldid=").append(fieldid);
        sb.append(", fdtimeStart=").append(fdtimeStart);
        sb.append(", fdtimeEnd=").append(fdtimeEnd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}