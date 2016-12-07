package Sys.data.domain;

/**
 * Created by tanjian on 16/12/5.
 * 职工实体
 */
public class zg {
    private String xy_xy_id;
    private String zg_code;
    private String xy_id;
    private String zg_name;
    private String zg_xb;
    private String zg_ms;
    private String zg_csrq;
    private String zg_xl;
    private String zg_zc;
    private String zg_zzmm;
    private String zg_pwd;
    private String zg_pwd_salt;

    public zg(String xy_xy_id, String zg_code,
              String xy_id, String zg_name,
              String zg_xb, String zg_ms,
              String zg_csrq, String zg_xl,
              String zg_zc, String zg_zzmm,
              String zg_pwd, String zg_pwd_salt) {
        this.xy_xy_id = xy_xy_id;
        this.zg_code = zg_code;
        this.xy_id = xy_id;
        this.zg_name = zg_name;
        this.zg_xb = zg_xb;
        this.zg_ms = zg_ms;
        this.zg_csrq = zg_csrq;
        this.zg_xl = zg_xl;
        this.zg_zc = zg_zc;
        this.zg_zzmm = zg_zzmm;
        this.zg_pwd = zg_pwd;
        this.zg_pwd_salt = zg_pwd_salt;
    }


    public String getXy_xy_id() {
        return xy_xy_id;
    }

    public void setXy_xy_id(String xy_xy_id) {
        this.xy_xy_id = xy_xy_id;
    }

    public String getZg_code() {
        return zg_code;
    }

    public void setZg_code(String zg_code) {
        this.zg_code = zg_code;
    }

    public String getXy_id() {
        return xy_id;
    }

    public void setXy_id(String xy_id) {
        this.xy_id = xy_id;
    }

    public String getZg_name() {
        return zg_name;
    }

    public void setZg_name(String zg_name) {
        this.zg_name = zg_name;
    }

    public String getZg_xb() {
        return zg_xb;
    }

    public void setZg_xb(String zg_xb) {
        this.zg_xb = zg_xb;
    }

    public String getZg_ms() {
        return zg_ms;
    }

    public void setZg_ms(String zg_ms) {
        this.zg_ms = zg_ms;
    }

    public String getZg_csrq() {
        return zg_csrq;
    }

    public void setZg_csrq(String zg_csrq) {
        this.zg_csrq = zg_csrq;
    }

    public String getZg_xl() {
        return zg_xl;
    }

    public void setZg_xl(String zg_xl) {
        this.zg_xl = zg_xl;
    }

    public String getZg_zc() {
        return zg_zc;
    }

    public void setZg_zc(String zg_zc) {
        this.zg_zc = zg_zc;
    }

    public String getZg_zzmm() {
        return zg_zzmm;
    }

    public void setZg_zzmm(String zg_zzmm) {
        this.zg_zzmm = zg_zzmm;
    }

    public String getZg_pwd() {
        return zg_pwd;
    }

    public void setZg_pwd(String zg_pwd) {
        this.zg_pwd = zg_pwd;
    }

    public String getZg_pwd_salt() {
        return zg_pwd_salt;
    }

    public void setZg_pwd_salt(String zg_pwd_salt) {
        this.zg_pwd_salt = zg_pwd_salt;
    }

    @Override
    public String toString() {
        return "{" +
                "xy_xy_id:" + xy_xy_id  +
                ", zg_code:" + zg_code  +
                ", xy_id:" + xy_id  +
                ", zg_name:" + zg_name  +
                ", zg_xb:" + zg_xb  +
                ", zg_ms:" + zg_ms  +
                ", zg_csrq:" + zg_csrq  +
                ", zg_xl:" + zg_xl +
                ", zg_zc:" + zg_zc  +
                ", zg_zzmm:" + zg_zzmm  +
                ", zg_pwd:" + zg_pwd  +
                ", zg_pwd_salt:" + zg_pwd_salt+
                "}";
    }
}
