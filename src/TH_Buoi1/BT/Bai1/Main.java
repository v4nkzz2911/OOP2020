package TH_Buoi1.BT.Bai1;

public class Main {
    public static void main(String[] args) {
        processStudent.createList();
        processStudent.write("sinhvien.dat");
        System.out.println("Đọc file");
        processStudent.read("sinhvien.dat");
        processStudent.outputList();
    }
}
