package com.ggms.pojo;

import java.io.Serializable;

public class Field implements Serializable {
    private Integer fieldid;

    private String fname;

    private String flocation;

    private String fhost;

    private String fhostcall;

    private Integer frent;

    private static final long serialVersionUID = 1L;

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

    public String getFlocation() {
        return flocation;
    }

    public void setFlocation(String flocation) {
        this.flocation = flocation;
    }

    public String getFhost() {
        return fhost;
    }

    public void setFhost(String fhost) {
        this.fhost = fhost;
    }

    public String getFhostcall() {
        return fhostcall;
    }

    public void setFhostcall(String fhostcall) {
        this.fhostcall = fhostcall;
    }

    public Integer getFrent() {
        return frent;
    }

    public void setFrent(Integer frent) {
        this.frent = frent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fieldid=").append(fieldid);
        sb.append(", fname=").append(fname);
        sb.append(", flocation=").append(flocation);
        sb.append(", fhost=").append(fhost);
        sb.append(", fhostcall=").append(fhostcall);
        sb.append(", frent=").append(frent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}