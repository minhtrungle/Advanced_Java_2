package Exercises1.Ex3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student[] st = new Student[3];

        st[0] = new Student(1, "LMT", 8);
        st[1] = new Student(2, "LMT2", 5);
        st[2] = new Student(3, "LMT3", 8);

        // Mặc định sắp xếp danh sách st theo tăng dần của điểm
        SortArray s = new SortArray();
        //in ra danh sách trước khi sắp xếp
        s.printArray(st);
        //in ra danh sách sau khi sắp xếp
        s.sorted(st);
        s.printArray(st);

        //Tạo mảng hình tròn
        HinhTron[] ht = new HinhTron[5];
        Random random = new Random();
        for (int i = 0; i < ht.length; i++) {
            ht[i] = new HinhTron(random.nextInt(100) + 1);
        }
    }
}
