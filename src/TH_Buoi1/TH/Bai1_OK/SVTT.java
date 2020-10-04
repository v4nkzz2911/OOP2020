package TH_Buoi1.TH.Bai1_OK;

import java.util.Date;

public class SVTT extends SV {

    private double fee;

    public SVTT() {
    }

    public SVTT(double fee, String ID, String name, String sex, Date birthday, float score) {
        super(ID, name, sex, birthday, score);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "SVTT{" + super.toString()
                + "fee=" + fee
                + '}';
    }
}
