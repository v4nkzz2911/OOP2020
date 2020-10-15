package TH_Buoi3.Bai12;

import java.util.Scanner;

public class CBGV extends Nguoi {
    protected int basesalary;
    protected int reward;
    protected int punish;
    protected int salary;

    public CBGV(String name, int birthyear, String hometown) {
        super(name, birthyear, hometown);
    }

    public CBGV() {
    }

    public CBGV(String name, int birthyear, String hometown, int basesalary, int reward, int punish, int salary) {
        super(name, birthyear, hometown);
        this.basesalary = basesalary;
        this.reward = reward;
        this.punish = punish;
        this.salary = salary;
    }

    public int getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(int basesalary) {
        this.basesalary = basesalary;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getPunish() {
        return punish;
    }

    public void setPunish(int punish) {
        this.punish = punish;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lương cơ bản: ");
        this.basesalary = sc.nextInt();
        System.out.println("Nhập thưởng: ");
        this.reward = sc.nextInt();
        System.out.println("Nhập phạt: ");
        this.punish = sc.nextInt();
    }

    public int calcSalary(){
        this.salary = this.basesalary + this.reward - this.punish;
        return this.salary;
    }

    public void xuat(){
        super.xuat();
        System.out.println("Lương cơ bản: "+this.basesalary);
        System.out.println("Thưởng: "+this.reward);
        System.out.println("Phạt: "+this.punish);
        System.out.println("Lương thực lĩnh: "+this.salary);
    }
}
