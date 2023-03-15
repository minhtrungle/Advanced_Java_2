package Day5.Example1_Junit5;

public class HinhTron {
    private double banKinh = 1.0;
    private static final double PI = 3.1415;
    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        if (banKinh <= 0) {
            throw new RuntimeException("Error");
        }
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh <= 0) {
            throw new RuntimeException("Error");
        }
        this.banKinh = banKinh;
    }
    public double chuVi() {
        return (double) Math.round(PI * 2 * banKinh * 1000) / 1000;
    }
    public double dienTich() {
        return (double) Math.round(PI * banKinh * banKinh * 1000) / 1000;
    }

}
