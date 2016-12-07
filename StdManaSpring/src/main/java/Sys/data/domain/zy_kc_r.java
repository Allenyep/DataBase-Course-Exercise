package Sys.data.domain;

/**
 * Created by tanjian on 16/12/6.
 * 专业课程关系表实体
 */
public class zy_kc_r {
    private String kc_id;
    private String xy_id;
    private String zy_id;

    public zy_kc_r(String kc_id, String xy_id, String zy_id) {
        this.kc_id = kc_id;
        this.xy_id = xy_id;
        this.zy_id = zy_id;
    }

    public String getKc_id() {
        return kc_id;
    }

    public void setKc_id(String kc_id) {
        this.kc_id = kc_id;
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

    @Override
    public String toString() {
        return "zy_kc_r{" +
                "kc_id='" + kc_id + '\'' +
                ", xy_id='" + xy_id + '\'' +
                ", zy_id='" + zy_id + '\'' +
                '}';
    }
}
