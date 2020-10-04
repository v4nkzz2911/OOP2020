package Buoi4.BaiTap.Bai1;

import java.io.Serializable;
import java.util.Scanner;

public class Nguoi implements Serializable {
    protected String name;
    protected int bornyear;

    public Nguoi(String name, int bornyear) {
        this.name = name;
        this.bornyear = bornyear;
    }

    public Nguoi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBornyear() {
        return bornyear;
    }

    public void setBornyear(int bornyear) {
        this.bornyear = bornyear;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        this.bornyear = sc.nextInt();
    }

    public void outputInfo(){
        System.out.println("Tên: "+this.name);
        System.out.println("Năm sinh: "+this.bornyear);
    }
}
