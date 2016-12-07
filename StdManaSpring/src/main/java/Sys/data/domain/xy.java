package Sys.data.domain;

/**
 * Created by tanjian on 16/12/5.
 * 学院实体
 */
public class xy {
    private String xy_id;
    private String xy_mc;
    private String xy_ms;

    public xy(String xy_id, String xy_mc, String xy_ms) {
        this.xy_id = xy_id;
        this.xy_mc = xy_mc;
        this.xy_ms = xy_ms;
    }

    public String getXy_id() {
        return xy_id;
    }

    public void setXy_id(String xy_id) {
        this.xy_id = xy_id;
    }

    public String getXy_mc() {
        return xy_mc;
    }

    public void setXy_mc(String xy_mc) {
        this.xy_mc = xy_mc;
    }

    public String getXy_ms() {
        return xy_ms;
    }

    public void setXy_ms(String xy_ms) {
        this.xy_ms = xy_ms;
    }


}
