package Buoi3.Bai1;

import Buoi2.Bai5.ThiSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    enum rank{
        yeu(2),trungbinh(5), kha(7) ,gioi(10);
        private int value;
        private rank(int value){
            this.value=value;
        }
    }

    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<SinhVien>(100);
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Nhập số thí sinh: ");
        n = sc.nextInt();
        for(i=0;i<n;i++) {
            SinhVien t = new SinhVien();
            t.inputInfo();
            list.add(t);
        }
        for(i=0;i<n;i++) {
            SinhVien t = new SinhVien();
            list.get(i).outputInfo();
            for(rank r:rank.values()){
                if (list.get(i).getAvr()<r.value){
                    System.out.println("Xếp loại: "+r);
                    break;
                }
            }

        }
        Collections.sort(list);
        for (SinhVien sv : list) {
            System.out.println(sv.getID() + " " + sv.getName() + " " + sv.getAvr());
        }

    }
}
