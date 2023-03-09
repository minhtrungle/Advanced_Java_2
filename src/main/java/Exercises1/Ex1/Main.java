package Exercises1.Ex1;

public class Main {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron(2);
        HinhVuong hv = new HinhVuong(3);
        Drawable d = new Drawable();

        d.draw(ht);
        d.draw(hv);

        HinhThangCan htc = new HinhThangCan();
        d.draw(htc); // chạy được do HinhHocExtends extends đến HinhHoc
    }
}
