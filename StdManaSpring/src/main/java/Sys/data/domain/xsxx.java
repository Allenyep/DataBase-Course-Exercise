package Sys.data.domain;

import java.util.Date;
/**
 * Created by tanjian on 16/12/5.
 * 学生信息实体
 */
public class xsxx {
    private String xs_xy_id;
    private String xs_zy_id;
    private String bj_code;
    private String xs_xh;
    private String xy_id;
    private String zy_id;
    private String xs_xm;
    private String xs_xb;
    private Date xs_csrq;
    private String xs_jl;
    private String xs_pwd;
    private String xs_pwd_salt;

    public xsxx(){}

    public xsxx(String xs_xy_id, String xs_zy_id, String bj_code,
                String xs_xh, String xy_id, String zy_id,
                String xs_xm, String xs_xb, Date xs_csrq,
                String xs_jl, String xs_pwd, String xs_pwd_salt) {
        this.xs_xy_id = xs_xy_id;
        this.xs_zy_id = xs_zy_id;
        this.bj_code = bj_code;
        this.xs_xh = xs_xh;
        this.xy_id = xy_id;
        this.zy_id = zy_id;
        this.xs_xm = xs_xm;
        this.xs_xb = xs_xb;
        this.xs_csrq = xs_csrq;
        this.xs_jl = xs_jl;
        this.xs_pwd = xs_pwd;
        this.xs_pwd_salt = xs_pwd_salt;
    }

    public String getXs_xy_id() {
        return xs_xy_id;
    }

    public void setXs_xy_id(String xs_xy_id) {
        this.xs_xy_id = xs_xy_id;
    }

    public String getXs_zy_id() {
        return xs_zy_id;
    }

    public void setXs_zy_id(String xs_zy_id) {
        this.xs_zy_id = xs_zy_id;
    }

    public String getBj_code() {
        return bj_code;
    }

    public void setBj_code(String bj_code) {
        this.bj_code = bj_code;
    }

    public String getXs_xh() {
        return xs_xh;
    }

    public void setXs_xh(String xs_xh) {
        this.xs_xh = xs_xh;
    }

    public String getXy_id() {
        return xy_id;
    }

    public void setXy_id(String xy_id) {
        this.xy_id = xy_id;
    }

    public String getZy_id() {
        return zy_id;
    }

    public void setZy_id(String zy_id) {
        this.zy_id = zy_id;
    }

    public String getXs_xm() {
        return xs_xm;
    }

    public void setXs_xm(String xs_xm) {
        this.xs_xm = xs_xm;
    }

    public String getXs_xb() {
        return xs_xb;
    }

    public void setXs_xb(String xs_xb) {
        this.xs_xb = xs_xb;
    }

    public Date getXs_csrq() {
        return xs_csrq;
    }

    public void setXs_csrq(Date xs_csrq) {
        this.xs_csrq = xs_csrq;
    }

    public String getXs_jl() {
        return xs_jl;
    }

    public void setXs_jl(String xs_jl) {
        this.xs_jl = xs_jl;
    }

    public String getXs_pwd() {
        return xs_pwd;
    }

    public void setXs_pwd(String xs_pwd) {
        this.xs_pwd = xs_pwd;
    }

    public String getXs_pwd_salt() {
        return xs_pwd_salt;
    }

    public void setXs_pwd_salt(String xs_pwd_salt) {
        this.xs_pwd_salt = xs_pwd_salt;
    }

    @Override
    public String toString() {
       //{"balance": 1000.21, "num":100, "is_vip":true, "name":"foo"}
        //拼接成Json
        return "{"+
                "xs_xy_id:" + xs_xy_id +
                ", xs_zy_id:" + xs_zy_id  +
                ", bj_code:" + bj_code  +
                ", xs_xh:" + xs_xh +
                ", xy_id:" + xy_id +
                ", zy_id:" + zy_id  +
                ", xs_xm:" + xs_xm  +
                ", xs_xb:" + xs_xb +
                ", xs_csrq:" + xs_csrq +
                ", xs_jl:" + xs_jl +
                ", xs_pwd:" + xs_pwd  +
                ", xs_pwd_salt:" + xs_pwd_salt +
                "}";
    }
}
