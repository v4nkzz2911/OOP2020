package TH_Buoi1.BT.Bai1;

import Buoi4.BaiTap.Bai1.SinhVien;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadFromBinaryFile {
    public static ArrayList<Student> docFile(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            ois.close();
            fis.close();
            return (ArrayList<Student>) data;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


