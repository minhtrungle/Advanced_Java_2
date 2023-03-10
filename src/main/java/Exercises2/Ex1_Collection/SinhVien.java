package Exercises2.Ex1_Collection;

public class SinhVien {
    private String id;
    private String name;
    private String birthday;
    private String address;

    public SinhVien() {
    }

    public SinhVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public SinhVien(String id, String name, String birthday, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SinhVien[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
}
