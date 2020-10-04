package Buoi4.BaiTap.Bai1;

import java.io.*;
import java.util.ArrayList;

public class ReadFromBinaryFile {
    public static ArrayList<SinhVien> docFile(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            ois.close();
            fis.close();
            return (ArrayList<SinhVien>) data;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


