package Sys.data.domain;

import java.util.Date;

/**
 * Created by tanjian on 16/12/5.
 * 学生班级实体
 */
public class xs_bj {
    private String xy_id;
    private String zy_id;
    private String bj_code;
    private String bj_mc;
    private String bj_zt;
    private Date bj_start;
    private Date bj_end;

    public xs_bj(String xy_id, String zy_id, String bj_code, String bj_mc, String bj_zt, Date bj_start, Date bj_end) {
        this.xy_id = xy_id;
        this.zy_id = zy_id;
        this.bj_code = bj_code;
        this.bj_mc = bj_mc;
        this.bj_zt = bj_zt;
        this.bj_start = bj_start;
        this.bj_end = bj_end;
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

    public String getBj_code() {
        return bj_code;
    }

    public void setBj_code(String bj_code) {
        this.bj_code = bj_code;
    }

    public String getBj_mc() {
        return bj_mc;
    }

    public void setBj_mc(String bj_mc) {
        this.bj_mc = bj_mc;
    }

    public String getBj_zt() {
        return bj_zt;
    }

    public void setBj_zt(String bj_zt) {
        this.bj_zt = bj_zt;
    }

    public Date getBj_start() {
        return bj_start;
    }

    public void setBj_start(Date bj_start) {
        this.bj_start = bj_start;
    }

    public Date getBj_end() {
        return bj_end;
    }

    public void setBj_end(Date bj_end) {
        this.bj_end = bj_end;
    }
}
