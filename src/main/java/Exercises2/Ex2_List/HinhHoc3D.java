package Exercises2.Ex2_List;

public interface HinhHoc3D extends Comparable<HinhHoc3D> {
    double tinhTheTich();
    default int compareTo(HinhHoc3D o) {
        if (this.tinhTheTich() > o.tinhTheTich()) {
            return 1;
        } else if (this.tinhTheTich() < o.tinhTheTich()) {
            return -1;
        }
        return 0;
    }
}

