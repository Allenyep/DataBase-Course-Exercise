package spittr.data.domain;

import java.util.Date;

/**
 * Created by tanjian on 2016/12/29.
 *
 */

public class adminUser {
    public adminUser(){

    }
    private String s_adminid;
    private int s_authid;
    private String s_adminaccount;
    private String s_adminPwd;
    private Date s_adminLogininDate;//允许为空

    public adminUser(String s_adminid, int s_authid, String s_adminaccount, String s_adminPwd, Date s_adminLogininDate) {
        this.s_adminid = s_adminid;
        this.s_authid = s_authid;
        this.s_adminaccount = s_adminaccount;
        this.s_adminPwd = s_adminPwd;
        this.s_adminLogininDate = s_adminLogininDate;
    }

    public String getS_adminid() {
        return s_adminid;
    }

    public void setS_adminid(String s_adminid) {
        this.s_adminid = s_adminid;
    }

    public int getS_authid() {
        return s_authid;
    }

    public void setS_authid(int s_authid) {
        this.s_authid = s_authid;
    }

    public String getS_adminaccount() {
        return s_adminaccount;
    }

    public void setS_adminaccount(String s_adminaccount) {
        this.s_adminaccount = s_adminaccount;
    }

    public String getS_adminPwd() {
        return s_adminPwd;
    }

    public void setS_adminPwd(String s_adminPwd) {
        this.s_adminPwd = s_adminPwd;
    }



    public Date getS_adminLogininDate() {
        return s_adminLogininDate;
    }

    public void setS_adminLogininDate(Date s_adminLogininDate) {
        this.s_adminLogininDate = s_adminLogininDate;
    }

    @Override
    public String toString() {
        return "adminUser{" +
                "s_adminid:" + s_adminid + ',' +
                " s_authid:" + s_authid +
                "s_adminaccount:" + s_adminaccount + ',' +
                "s_adminPwd:" + s_adminPwd + ',' +
                "s_adminLogininDate:" + s_adminLogininDate +
                '}';
    }
}
