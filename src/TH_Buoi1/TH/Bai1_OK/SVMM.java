package TH_Buoi1.TH.Bai1_OK;

import java.util.Date;

public class SVMM extends SV {

    private float salary;

    public SVMM() {
        super();
    }

    public SVMM(float salary, String ID, String name, String sex, Date birthday, float score) {
        super(ID, name, sex, birthday, score);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SVMM{" + super.toString()
                + "salary=" + salary
                + '}';
    }
}
