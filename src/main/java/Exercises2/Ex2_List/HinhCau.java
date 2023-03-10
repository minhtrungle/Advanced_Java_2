package Exercises2.Ex2_List;

public class HinhCau implements HinhHoc3D{
    private double banKinh = 1.0;

    public HinhCau() {
    }

    public HinhCau(double banKinh) {
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
    public String toString() {
        return "HinhCau[" +
                "banKinh=" + banKinh +
                ']';
    }

    @Override
    public double tinhTheTich() {
        return (4/3) * Math.PI * Math.pow(banKinh, 3);
    }

//    @Override
//    public double tinhTheTich(Object[] objects) {
//        return (4/3) * Math.PI * Math.pow(banKinh, 3);
//    }
}
