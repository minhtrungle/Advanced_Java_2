package Exercises1.Ex2;

public class TinhToanSoPhuc implements TinhToan <SoPhuc>{
    @Override
    public SoPhuc cong(SoPhuc... args) {
        SoPhuc t = new SoPhuc();
        for (SoPhuc p : args) {
            t = t.congSP(p);
        }
        return t;
    }

    @Override
    public SoPhuc tru(SoPhuc t1, SoPhuc t2) {
        return t1.truSP(t2);
    }

    @Override
    public SoPhuc nhan(SoPhuc... args) {
        SoPhuc t = new SoPhuc();
        for (SoPhuc p : args) {
            t = t.nhanSP(p);
        }
        return t;
    }

    @Override
    public SoPhuc chia(SoPhuc t1, SoPhuc t2) {
        return t1.chiaSP(t2);
    }
}
