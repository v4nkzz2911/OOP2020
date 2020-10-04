package TH_Buoi1.TH.Bai1;

public class SVTT extends SV {
    private double fee;

    public SVTT() {
    }

    public SVTT(String name, String sex, String birthday, double fee) {
        super(name, sex, birthday);
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
        return "SVTT{" + super.toString() +
                "fee=" + fee +
                '}';
    }
}
