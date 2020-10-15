package TH_Buoi3.Bai12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFromTextFile {
    public static ArrayList<CBGV> docFile(String path) {
        ArrayList<CBGV> ds = new ArrayList<CBGV>();
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (line != null) {
                CBGV t = new CBGV();
                if (line.length() > 0) {
                    //System.out.println(line);
                    String[] result = line.split("\\$");
                    //System.out.println(Arrays.toString(result));
                    t.setName(result[0]);
                    t.setBirthyear(Integer.parseInt(result[1]));
                    t.setHometown(result[2]);
                    t.setBasesalary(Integer.parseInt(result[3]));
                    t.setReward(Integer.parseInt(result[4]));
                    t.setPunish(Integer.parseInt(result[5]));
                    t.setSalary(Integer.parseInt(result[6]));

                    ds.add(t);
                }
                line = br.readLine();
            }
            br.close();
            isr.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return ds;
    }
}


