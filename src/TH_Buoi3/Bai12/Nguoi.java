package TH_Buoi3.Bai12;

import java.util.Scanner;

public class Nguoi {
    protected String name;
    protected int birthyear;
    protected String hometown;

    public Nguoi(String name, int birthyear, String hometown) {
        this.name = name;
        this.birthyear = birthyear;
        this.hometown = hometown;
    }

    public Nguoi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        this.birthyear = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập quê quán: ");
        this.hometown = sc.nextLine();
    }

    public void xuat(){
        System.out.println("Tên: "+this.name);
        System.out.println("Năm sinh: "+this.birthyear);
        System.out.println("Quê quán: "+this.hometown);
    }
}
