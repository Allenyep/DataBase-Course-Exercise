package Sys.data.domain;

/**
 * Created by tanjian on 16/12/5.
 *学生奖惩关系表实体
 */
public class xsjc_r {
    private String xs_xy_id;
    private String xs_zy_id;
    private String bj_code;
    private String xs_xh;
    private String xsjc_id;

    public xsjc_r(String xs_xy_id, String xs_zy_id, String bj_code, String xs_xh, String xsjc_id) {
        this.xs_xy_id = xs_xy_id;
        this.xs_zy_id = xs_zy_id;
        this.bj_code = bj_code;
        this.xs_xh = xs_xh;
        this.xsjc_id = xsjc_id;
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

    public String getXsjc_id() {
        return xsjc_id;
    }

    public void setXsjc_id(String xsjc_id) {
        this.xsjc_id = xsjc_id;
    }
}
