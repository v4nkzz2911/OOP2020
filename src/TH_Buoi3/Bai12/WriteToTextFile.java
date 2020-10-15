package TH_Buoi3.Bai12;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class WriteToTextFile {
    public static boolean ghiFile(ArrayList<CBGV> dsc, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            for (CBGV t : dsc) {
                String target;
                target = t.getName() + "$"
                        +t.getBirthyear() + "$"
                        +t.getHometown() + "$"
                        +t.getBasesalary() + "$"
                        +t.getReward() + "$"
                        +t.getPunish() + "$"
                        +t.getSalary();


                bw.write(target);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

