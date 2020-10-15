package TH_Buoi3.Bai12;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<CBGV> list = new ArrayList<>(10000);
    public void createList(){
        Scanner sc = new Scanner(System.in);
        String rep="y";
        while (rep.equals("y")) {
            CBGV t = new CBGV();
            t.nhap();
            t.calcSalary();
            list.add(t);
            System.out.println("Nhập tiếp(y/n)? ");
            rep = sc.nextLine();
        }
    }

    public void showList(){
        int i;
        for (i=0;i<list.size();i++ ){
            list.get(i).xuat();
        }
    }

    public void ghiFile(){
        if (WriteToTextFile.ghiFile(list,"ds.txt")){
            System.out.println("Thành công!");
        }
        else{
            System.out.println("Thất bại");
        }
    }

    public void docFile(){
        list = ReadFromTextFile.docFile("ds.txt");
        System.out.println("Xong!");
    }


}
