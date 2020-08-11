package cn.com.demo.springboot.demo.entity;

public class DmAccount {
    private Integer accId;

    private String accCode;

    private String accPassword;

    private Double accMoney;

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode == null ? null : accCode.trim();
    }

    public String getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword == null ? null : accPassword.trim();
    }

    public Double getAccMoney() {
        return accMoney;
    }

    public void setAccMoney(Double accMoney) {
        this.accMoney = accMoney;
    }
}