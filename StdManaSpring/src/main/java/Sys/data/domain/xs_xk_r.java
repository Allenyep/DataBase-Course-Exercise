package Sys.data.domain;

/**
 * Created by tanjian on 16/12/5.
 * 学生选课关系表
 */
public class xs_xk_r {
    private String kc_id;
    private String xs_xy_id;
    private String xs_zy_id;
    private String bj_code;
    private String xs_xh;
    private double cj;
    private double bk;
    private double bkcj;

    public xs_xk_r(String kc_id, String xs_xy_id,
                   String xs_zy_id, String bj_code, String xs_xh,
                   double cj, double bk, double bkcj) {
        this.kc_id = kc_id;
        this.xs_xy_id = xs_xy_id;
        this.xs_zy_id = xs_zy_id;
        this.bj_code = bj_code;
        this.xs_xh = xs_xh;
        this.cj = cj;
        this.bk = bk;
        this.bkcj = bkcj;
    }

    public String getKc_id() {
        return kc_id;
    }

    public void setKc_id(String kc_id) {
        this.kc_id = kc_id;
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

    public double getCj() {
        return cj;
    }

    public void setCj(double cj) {
        this.cj = cj;
    }

    public double getBk() {
        return bk;
    }

    public void setBk(double bk) {
        this.bk = bk;
    }

    public double getBkcj() {
        return bkcj;
    }

    public void setBkcj(double bkcj) {
        this.bkcj = bkcj;
    }
}
