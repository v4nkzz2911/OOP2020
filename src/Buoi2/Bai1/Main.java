package Buoi2.Bai1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HCN x = new HCN();
        System.out.println("Nhập chiều dài: ");
        x.setChieudai(sc.nextDouble());
        System.out.println("Nhập chiều rộng: ");
        x.setChieurong(sc.nextDouble());

        System.out.println(x.toString());
    }


}
