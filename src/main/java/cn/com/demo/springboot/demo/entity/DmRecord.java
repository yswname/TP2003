package cn.com.demo.springboot.demo.entity;

public class DmRecord {
    private String rdPhone;

    private Long rdUp;

    private Long rdDown;

    private Long rdSum;

    public String getRdPhone() {
        return rdPhone;
    }

    public void setRdPhone(String rdPhone) {
        this.rdPhone = rdPhone == null ? null : rdPhone.trim();
    }

    public Long getRdUp() {
        return rdUp;
    }

    public void setRdUp(Long rdUp) {
        this.rdUp = rdUp;
    }

    public Long getRdDown() {
        return rdDown;
    }

    public void setRdDown(Long rdDown) {
        this.rdDown = rdDown;
    }

    public Long getRdSum() {
        return rdSum;
    }

    public void setRdSum(Long rdSum) {
        this.rdSum = rdSum;
    }
}