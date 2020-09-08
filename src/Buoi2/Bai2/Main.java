package Buoi2.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<SinhVien>(3);
        String rep="y";
        Scanner sc = new Scanner(System.in);
        int i;
        while (rep.equals("y")) {
            SinhVien t = new SinhVien();
            t.nhapSV();
            list.add(t);
            System.out.println("Nhập tiếp?(y/n)");
            rep = sc.nextLine();
        }
        System.out.println("MSV\tTÊN\tĐIỂM LT\tĐIỂM TH\tĐIỂM TB");
        for(i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
