package Sys.data.domain;

/**
 * Created by tanjian on 16/12/5.
 * 教学计划实体
 */
public class jxjh {
    private String jxjh_id;
    private String xy_id;
    private String zy_id;
    private String jxjh_mc;
    private String jxjh_date;
    private String jxjh_ms;

    public jxjh(String jxjh_id, String xy_id,
                String zy_id, String jxjh_mc,
                String jxjh_date, String jxjh_ms) {
        this.jxjh_id = jxjh_id;
        this.xy_id = xy_id;
        this.zy_id = zy_id;
        this.jxjh_mc = jxjh_mc;
        this.jxjh_date = jxjh_date;
        this.jxjh_ms = jxjh_ms;
    }

    public String getJxjh_id() {
        return jxjh_id;
    }

    public void setJxjh_id(String jxjh_id) {
        this.jxjh_id = jxjh_id;
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

    public String getJxjh_mc() {
        return jxjh_mc;
    }

    public void setJxjh_mc(String jxjh_mc) {
        this.jxjh_mc = jxjh_mc;
    }

    public String getJxjh_date() {
        return jxjh_date;
    }

    public void setJxjh_date(String jxjh_date) {
        this.jxjh_date = jxjh_date;
    }

    public String getJxjh_ms() {
        return jxjh_ms;
    }

    public void setJxjh_ms(String jxjh_ms) {
        this.jxjh_ms = jxjh_ms;
    }

    @Override
    public String toString() {
        return "jxjh{" +
                "jxjh_id='" + jxjh_id + '\'' +
                ", xy_id='" + xy_id + '\'' +
                ", zy_id='" + zy_id + '\'' +
                ", jxjh_mc='" + jxjh_mc + '\'' +
                ", jxjh_date='" + jxjh_date + '\'' +
                ", jxjh_ms='" + jxjh_ms + '\'' +
                '}';
    }
}
