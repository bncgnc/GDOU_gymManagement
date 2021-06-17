package com.ggms.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private String userid;

    private String uname;

    private Integer ucredit;

    private Integer utype;

    private String uunit;

    private String upassword;

    private String uphone;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUcredit() {
        return ucredit;
    }

    public void setUcredit(Integer ucredit) {
        this.ucredit = ucredit;
    }

    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    public String getUunit() {
        return uunit;
    }

    public void setUunit(String uunit) {
        this.uunit = uunit;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", uname=").append(uname);
        sb.append(", ucredit=").append(ucredit);
        sb.append(", utype=").append(utype);
        sb.append(", uunit=").append(uunit);
        sb.append(", upassword=").append(upassword);
        sb.append(", uphone=").append(uphone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}