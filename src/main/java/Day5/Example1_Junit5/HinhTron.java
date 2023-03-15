package Day5.Example1_Junit5;

public class HinhTron {
    private static final double PI = 3.1415;
    private double banKinh = 1.0;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        if(banKinh <= 0){
            throw new RuntimeException("Không hợp lệ");
        }
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if(banKinh <= 0){
            throw new RuntimeException("Không hợp lệ");
        }
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return banKinh * 2 * PI;
    }

    public double tinhDienTich() {
        return banKinh * banKinh * PI;
    }
}
