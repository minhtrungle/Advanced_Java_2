package Day1.Exercises1.Ex1;

public class HinhTron implements HinhHoc{
    private double banKinh = 0;

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

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
