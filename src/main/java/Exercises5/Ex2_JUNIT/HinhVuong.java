package Exercises5.Ex2_JUNIT;

public class HinhVuong {
    private double canh = 1.0;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        if (canh <=0) {
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if (canh <=0) {
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.canh = canh;
    }
    public double chuVi() {
        double chuvi = 4 * canh;
        return chuvi;
    }
    public double dienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return "HinhVuong:[" +
                "canh=" + canh +
                ']';
    }
}
