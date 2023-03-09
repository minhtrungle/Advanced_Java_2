package Day1.Ex1;

public class MainPhanSo {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(3,4);//phan so thu nhat
        PhanSo p2 = new PhanSo(7,4); //phan so thu 2
        System.out.println(p1.cong(p2).ruGon());
        System.out.println(p1.tru(p2).ruGon());
        System.out.println(p1.nhan(p2).ruGon());
        System.out.println(p1.chia(p2).ruGon());
    }
}
