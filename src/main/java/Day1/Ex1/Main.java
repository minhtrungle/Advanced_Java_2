package Day1.Ex1;

public class Main {
    public static void main(String[] args) {
        MayTinh <Double> mt = new MayTinhDouble();
        //tong
        System.out.println(mt.tong(3.0, 4.0, 5.0, 6.0));

        MayTinh <PhanSo> mt1 = new MayTinhPhanSo();

        PhanSo p1 = new PhanSo(1, 2);
        PhanSo p2 = new PhanSo(3, 4);
        PhanSo p3 = new PhanSo(5, 6);

        PhanSo t1 = mt1.tong(p1, p2, p3).ruGon();
        System.out.println(t1);

    }
}
