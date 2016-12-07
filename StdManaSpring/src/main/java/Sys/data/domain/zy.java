package Sys.data.domain;

/**
 * Created by tanjian on 16/12/6.
 * 专业实体
 */
public class zy {
    private String xy_id;
    private String zy_id;
    private String zy_mc;

    public zy(String xy_id, String zy_id, String zy_mc) {
        this.xy_id = xy_id;
        this.zy_id = zy_id;
        this.zy_mc = zy_mc;
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

    public String getZy_mc() {
        return zy_mc;
    }

    public void setZy_mc(String zy_mc) {
        this.zy_mc = zy_mc;
    }

    @Override
    public String toString() {
        return "zy{" +
                "xy_id='" + xy_id + '\'' +
                ", zy_id='" + zy_id + '\'' +
                ", zy_mc='" + zy_mc + '\'' +
                '}';
    }
}
