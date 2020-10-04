package Buoi4.BaiTap.Bai2;

public class ThiSinh {
    protected String ID;
    protected String name;
    protected String address;
    protected String priority;

    public ThiSinh(String ID, String name, String address, String priority) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public ThiSinh() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }


}
