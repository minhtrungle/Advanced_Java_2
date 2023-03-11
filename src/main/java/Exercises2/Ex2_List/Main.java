package Exercises2.Ex2_List;

import java.util.*;

public class Main {
//    public void minV(double[] arr) {
//    double min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//            return arr[i];
//        }
//        return 0;
//    }
    public static void main(String[] args) {
        List<HinhHoc3D> arrHinh = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Số hình mỗi loại muốn nhập: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            HinhCau hc = new HinhCau();
            HinhLapPhuong hlp = new HinhLapPhuong();
            HinhTru ht = new HinhTru();

            System.out.print("Nhập bán kính hình cầu: ");
            double bkHinhCau = in.nextDouble();
            hc.setBanKinh(bkHinhCau);
            arrHinh.add(hc);

            System.out.print("Nhập cạnh hình lập phương: ");
            double canhHLP = in.nextDouble();
            hlp.setCanh(canhHLP);
            arrHinh.add(hlp);

            System.out.print("Nhập bán kính đáy hình trụ: ");
            double bkHinhTru = in.nextDouble();
            ht.setBanKinh(bkHinhTru);
            arrHinh.add(ht);

            System.out.print("Nhập chiều cao hình trụ: ");
            double ccHinhTru = in.nextDouble();
            ht.setChieuCao(ccHinhTru);
            arrHinh.add(ht);
        }
        System.out.println(arrHinh);
        in.close();
        //In ra hình có thể tích nhỏ nhất.
        double min = arrHinh.get(0).tinhTheTich();
        int index = 0;
        for (int i = 1; i < arrHinh.size(); i++) {
            if (min > arrHinh.get(i).tinhTheTich()) {
                min = arrHinh.get(i).tinhTheTich();
                index = i;
            }
        }
        System.out.println("Hình có thể tích nhỏ nhất là: " + arrHinh.get(index));
        //cách 2
//        HinhHoc3D minHH3D = arrHinh.get(0);
//        for (int i = 1; i < arrHinh.size(); i++) {
//            if(minHH3D.tinhTheTich() > arrHinh.get(i).tinhTheTich()) {
//                minHH3D = arrHinh.get(i);
//            }
//        }
//        System.out.println(minHH3D);

        //Tính trung bình cộng thể tích các hình
        double Sum = 0;
        double result = 0;
        for (int i = 0; i < arrHinh.size(); i++) {
            Sum += arrHinh.get(i).tinhTheTich();
        }
        result = Sum / arrHinh.size();
        System.out.println("Trung bình cộng thể tích là: " + result);

        //Sắp xếp theo thể tích tăng dần
        Collections.sort(arrHinh);
        System.out.println(arrHinh);

        //Sắp xếp theo thể tích giảm dần
        Collections.sort(arrHinh, new Comparator<HinhHoc3D>() {
            @Override
            public int compare(HinhHoc3D o1, HinhHoc3D o2) {
                if (o1.tinhTheTich() > o2.tinhTheTich()) {
                    return -1;
                } else if (o1.tinhTheTich() > o2.tinhTheTich()) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(arrHinh);
    }
}
