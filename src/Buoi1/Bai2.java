package Buoi1;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Bai2 {
    public static int ktnt(int a){
        if (a<2) return 0;
        if (a==2) return 1;
        int i;
        for(i=2;i<=sqrt(a);i++){
            if (a%i==0) return 0;
        }
        return 1;
    }
    public static void in(int a){
        for(int i=a-1;i>1;i--) {
            if (ktnt(i) == 1) System.out.print(i + "  ");
        }

    }

    public static void inhh(int a){
        for(int i=a-1;i>1;i--) {
            if (kthh(i) == 1) System.out.print(i + "  ");
        }

    }

    public static int kthh(int a){
        int i,t=0;
        for(i=1;i<a;i++){
            if (a%i==0) t+=i;
        }
        if (a==t) return 1;
        else return 0;
    }

    public static int ucln(int a, int b) {
        if (b > a) {
            int t;
            t = a;
            a = b;
            b = t;
        }
        int kq = 1, i;
        for (i = 2; i <= b; i++) {
            if (((a % i) == 0) && (b % i) == 0) kq = i;
        }
        return kq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập a: ");
        a = sc.nextInt();
        if (ktnt(a)==1) System.out.println("Là NT");
        else System.out.println("Không là NT");
        System.out.println("Các số NT nhỏ hơn a: ");
        in(a-1);

        System.out.println();
        System.out.println("Nhập a: ");
        a = sc.nextInt();
        if (kthh(a)==1) System.out.println("Là số hoàn hảo");
        else System.out.println("Không là số hoàn hảo");
        System.out.println("Các số hoàn hảo nhỏ hơn a: ");
        inhh(a-1);

        int b;
        System.out.println("Nhập a: ");
        a = sc.nextInt();
        System.out.println("Nhập b: ");
        b = sc.nextInt();
        System.out.println("Ước chung lớn nhất: "+ucln(a,b));

        System.out.println("Nhập tử số: ");
        a = sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        b = sc.nextInt();
        System.out.println("Phân số sau khi rút gọn: "+(a/ucln(a,b))+"/"+(b/ucln(a,b)));



    }
}
