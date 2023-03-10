package Exercises2.Ex2_List;

public class HinhLapPhuong implements HinhHoc3D{
    private double canh = 1.0;

    public HinhLapPhuong() {
    }

    public HinhLapPhuong(double canh) {
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
    public String toString() {
        return "HinhLapPhuong[" +
                "canh=" + canh +
                ']';
    }

    @Override
    public double tinhTheTich() {
        return Math.pow(canh, 3);
    }

}
