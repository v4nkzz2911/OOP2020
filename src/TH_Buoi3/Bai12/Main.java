package TH_Buoi3.Bai12;

import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("1.Nhập danh sách");
        System.out.println("2.Xuất danh sách");
        System.out.println("3.Ghi danh sách vào textfile");
        System.out.println("4.Đọc danh sách từ textfile");
        System.out.println("5.Thoát");
        System.out.print("Lựa chọn: ");
    }
    public static void main(String[] args) {
        Manager m = new Manager();
        Scanner sc =new Scanner(System.in);
        int rep = 0;
        while (rep!=5){
            menu();
            rep = sc.nextInt();
            switch (rep){
                case 1 :
                    m.createList();
                    break;
                case 2 :
                    m.showList();
                    break;
                case 3:
                    m.ghiFile();
                    break;
                case 4:
                    m.docFile();
                    break;
            }
        }
    }
}
