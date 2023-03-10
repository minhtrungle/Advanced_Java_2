package Exercises2.Ex2_List;

public class HinhTru implements HinhHoc3D{
    private double banKinh = 1.0;
    private double chieuCao = 1.0;

    public HinhTru() {
    }

    public HinhTru(double banKinh, double chieuCao) {
        if (banKinh <= 0 || chieuCao <= 0) {
            throw new RuntimeException("Error");
        }
        this.banKinh = banKinh;
        this.chieuCao = chieuCao;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh <= 0 || chieuCao <= 0) {
            throw new RuntimeException("Error");
        }
        this.banKinh = banKinh;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return "HinhTru[" +
                "banKinh=" + banKinh +
                ", chieuCao=" + chieuCao +
                ']';
    }

    @Override
    public double tinhTheTich() {
        return Math.PI * Math.pow(banKinh, 2) * chieuCao;
    }
}
