package cn.com.demo.springboot.demo.entity;

public class DmUser {
    private Integer urId;

    private String urUserName;

    private String urName;

    private String urPassword;

    private String urSex;

    private Integer urAge;

    private String urPhone;

    public Integer getUrId() {
        return urId;
    }

    public void setUrId(Integer urId) {
        this.urId = urId;
    }

    public String getUrUserName() {
        return urUserName;
    }

    public void setUrUserName(String urUserName) {
        this.urUserName = urUserName == null ? null : urUserName.trim();
    }

    public String getUrName() {
        return urName;
    }

    public void setUrName(String urName) {
        this.urName = urName == null ? null : urName.trim();
    }

    public String getUrPassword() {
        return urPassword;
    }

    public void setUrPassword(String urPassword) {
        this.urPassword = urPassword == null ? null : urPassword.trim();
    }

    public String getUrSex() {
        return urSex;
    }

    public void setUrSex(String urSex) {
        this.urSex = urSex == null ? null : urSex.trim();
    }

    public Integer getUrAge() {
        return urAge;
    }

    public void setUrAge(Integer urAge) {
        this.urAge = urAge;
    }

    public String getUrPhone() {
        return urPhone;
    }

    public void setUrPhone(String urPhone) {
        this.urPhone = urPhone == null ? null : urPhone.trim();
    }
}