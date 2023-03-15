package Exercises5.Ex1_JDBC.Model;

public class Brand {
    private int id;
    private String BrandName;
    private String BrandAddress;

    public Brand() {
    }

    public Brand(String BrandName, String BrandAddress) {
        this.BrandName = BrandName;
        this.BrandAddress = BrandAddress;
    }

    public Brand(int id, String BrandName, String BrandAddress) {
        this.id = id;
        this.BrandName = BrandName;
        this.BrandAddress = BrandAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getBrandAddress() {
        return BrandAddress;
    }

    public void setBrandAddress(String BrandAddress) {
        this.BrandAddress = BrandAddress;
    }

    @Override
    public String toString() {
        return "Brand[" +
                "id=" + id +
                ", BrandName='" + BrandName + '\'' +
                ", BrandAddress='" + BrandAddress + '\'' +
                ']';
    }
}
