package Exercises1.Ex1;

public class Drawable /*<T extends HinhHoc>*/ { //extends de lay cac phuong thuc ben HinhHoc
    public <T extends HinhHoc> void draw(T t) { //Dua xuong duoi de chi minh phuong thuc draw su dung
        String s = String.format("Ve hinh %s, co dien tich la %.2f, chu vi la %,2f", t.getClass().getSimpleName(), t.tinhChuVi(), t.tinhDienTich());
        System.out.println(s);
    }
}
