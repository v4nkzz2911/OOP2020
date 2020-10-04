package TH_Buoi1.TH.Bai1;

public class SVMM extends SV {
    private float salary;

    public SVMM() {
        super();
    }

    public SVMM(String name, String sex, String birthday, float salary) {
        super(name, sex, birthday);
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
        return "SVMM{" + super.toString() +
                "salary=" + salary +
                '}';
    }
}
