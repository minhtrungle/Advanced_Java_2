package Exercises1.Ex2;

public class SoPhuc {
    private double a = 0;
    private double b = 0;

    public SoPhuc() {
    }

    public SoPhuc(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    //Cong 2 so phuc
    public SoPhuc congSP(SoPhuc sp2) {
        double thuc = this.a + sp2.a;
        double ao  = this.b + sp2.b;
        return new SoPhuc(thuc, ao);
    }

    //Tru 2 so phuc
    public SoPhuc truSP(SoPhuc sp2) {
        double thuc = this.a - sp2.a;
        double ao  = this.b - sp2.b;
        return new SoPhuc(thuc, ao);
    }
    //Nhan 2 so phuc
    public SoPhuc nhanSP(SoPhuc sp2) {
        double thuc = this.a * sp2.a - this.b * sp2.b;
        double ao  = this.a * sp2.b + this.b * sp2.a;
        return new SoPhuc(thuc, ao);
    }
    //Chia 2 so phuc
    public SoPhuc chiaSP(SoPhuc sp2) {
        double thuc = (this.a * sp2.a + this.b * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        double ao  = (this.b * sp2.a - this.a * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        return new SoPhuc(thuc, ao);
    }

    @Override
    public String toString() {
        if (b < 0) {
            return String.format("%.1f - %.1fi", a, Math.abs(b));
        }
        return String.format("%.1f + %.1fi", a, b);
    }
}
