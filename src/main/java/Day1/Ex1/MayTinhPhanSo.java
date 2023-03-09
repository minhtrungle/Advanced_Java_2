package Day1.Ex1;

import java.awt.print.PrinterJob;

public class MayTinhPhanSo extends MayTinh<PhanSo> {
    @Override
    public PhanSo tong(PhanSo... phanSos) {
        PhanSo t = new PhanSo();
        for (PhanSo p : phanSos) {
            t = t.cong(p);
        }
        return t;
    }

    @Override
    public PhanSo hieu(PhanSo t1, PhanSo t2) {
        return null;
    }

    @Override
    public PhanSo tich(PhanSo... phanSos) {
        return null;
    }

    @Override
    public PhanSo thuong(PhanSo t1, PhanSo t2) {
        return null;
    }
}
