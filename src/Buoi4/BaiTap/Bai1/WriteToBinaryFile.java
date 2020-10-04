package Buoi4.BaiTap.Bai1;

import java.io.*;
import java.util.ArrayList;

public class WriteToBinaryFile {
    public static boolean ghiFile(ArrayList<SinhVien> dssv, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dssv);
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

