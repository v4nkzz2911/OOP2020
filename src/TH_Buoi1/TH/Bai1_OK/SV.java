package TH_Buoi1.TH.Bai1_OK;

import java.io.Serializable;
import java.util.Date;

public class SV implements Serializable{

    protected String ID;
    protected String name;
    protected String sex;
    protected Date birthday;
    protected float score;

    public SV() {
    }

    public SV(String ID, String name, String sex, Date birthday, float score) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.score = score;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return  "ID=" + ID + ", name=" + name + ", sex=" + sex + ", birthday=" + birthday + ", score=" + score ;
    }
    
    
    
    

    

   

    
}
