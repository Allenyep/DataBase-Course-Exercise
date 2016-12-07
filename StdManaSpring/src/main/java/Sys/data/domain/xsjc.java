package Sys.data.domain;

import java.util.Date;

/**
 * Created by tanjian on 16/12/5.
 * 学生奖惩实体
 */
public class xsjc {
    private String xsjc_id;
    private String xsjc_mc;
    private Date xsjc_date;
    private String xsjc_yy;

    public xsjc(String xsjc_id, String xsjc_mc, Date xsjc_date, String xsjc_yy) {
        this.xsjc_id = xsjc_id;
        this.xsjc_mc = xsjc_mc;
        this.xsjc_date = xsjc_date;
        this.xsjc_yy = xsjc_yy;
    }

    public String getXsjc_id() {
        return xsjc_id;
    }

    public void setXsjc_id(String xsjc_id) {
        this.xsjc_id = xsjc_id;
    }

    public String getXsjc_mc() {
        return xsjc_mc;
    }

    public void setXsjc_mc(String xsjc_mc) {
        this.xsjc_mc = xsjc_mc;
    }

    public Date getXsjc_date() {
        return xsjc_date;
    }

    public void setXsjc_date(Date xsjc_date) {
        this.xsjc_date = xsjc_date;
    }

    public String getXsjc_yy() {
        return xsjc_yy;
    }

    public void setXsjc_yy(String xsjc_yy) {
        this.xsjc_yy = xsjc_yy;
    }
}
