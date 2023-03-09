package Exercises1.Ex2;

public class Main {
    public static void main(String[] args) {
        TinhToan <SoPhuc> t1 = new TinhToanSoPhuc();
        SoPhuc sp1 = new SoPhuc(1,3);
        SoPhuc sp2 = new SoPhuc(2,4);
        SoPhuc sp3 = new SoPhuc(3,-3);

        SoPhuc result = t1.cong(sp1, sp2);
        SoPhuc result2 = t1.cong(sp2, sp3);
        System.out.println(result);
        System.out.println(result2);
    }
}
