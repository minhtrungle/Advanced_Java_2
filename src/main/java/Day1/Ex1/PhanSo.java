package Day1.Ex1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PhanSo {
    private long tuSo = 0;
    private long mauSo = 1;

    public PhanSo() {
    }

    public PhanSo(long tuSo, long mauSo) {
        if (mauSo == 0) {
            throw new RuntimeException("Error");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        if (mauSo == 0) {
            throw new RuntimeException("Error");
        }
        this.mauSo = mauSo;
    }
    public PhanSo ruGon() {
        BigInteger b1 = new BigInteger(String.valueOf(tuSo));
        BigInteger b2 = new BigInteger(String.valueOf(mauSo));

        long ucln = b1.gcd(b2).longValue();
        tuSo = tuSo / ucln;
        mauSo = mauSo / ucln;
        return this;
    }
    public PhanSo cong(PhanSo p) {
        long tuSoMoi = this.tuSo * p.mauSo + this.mauSo * p.tuSo;
        long mauSoMoi = this.mauSo * p.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo tru(PhanSo p) {
        long tuSoMoi = this.tuSo * p.mauSo - this.mauSo * p.tuSo;
        long mauSoMoi = this.mauSo * p.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo nhan(PhanSo p) {
        long tuSoMoi = this.tuSo * p.tuSo ;
        long mauSoMoi = this.mauSo * p.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo chia(PhanSo p) {
        if (p.tuSo == 0) {
            throw new RuntimeException("Error");
        }
        long tuSoMoi = this.tuSo * p.mauSo ;
        long mauSoMoi = this.mauSo * p.tuSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }
    @Override
    public String toString() {
        return String.format("%d/%d", tuSo, mauSo);
    }
}
