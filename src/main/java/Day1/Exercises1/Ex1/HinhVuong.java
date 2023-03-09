package Day1.Exercises1.Ex1;

public class HinhVuong implements HinhHoc{
    private double canh = 0;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Error");
        }
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Error");
        }
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }
}
