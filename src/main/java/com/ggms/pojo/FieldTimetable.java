package com.ggms.pojo;

import java.io.Serializable;
import java.util.Date;

public class FieldTimetable implements Serializable {
    private Integer fieldTimetableid;

    private Integer fieldid;

    private Date fdtimeStart;

    private Date fdtimeEnd;

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

    public Date getFdtimeStart() {
        return fdtimeStart;
    }

    public void setFdtimeStart(Date fdtimeStart) {
        this.fdtimeStart = fdtimeStart;
    }

    public Date getFdtimeEnd() {
        return fdtimeEnd;
    }

    public void setFdtimeEnd(Date fdtimeEnd) {
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