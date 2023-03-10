package Exercises2.Ex1_Collection;


import Day2.Example2_List.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void MainMenu() {
        System.out.println("1. Danh sách sinh viên ");
        System.out.println("2. Nhập thông tin sinh viên mới ");
        System.out.println("3. Tìm kiếm sinh viên theo ID ");
        System.out.println("4. Danh sách môn học ");
        System.out.println("5. Nhập thông tin môn học mới ");
        System.out.println("6. Nhập điểm môn học cho sinh viên ");
        System.out.println("7. Cập nhật điểm cho sinh viên ");
        System.out.println("8. Xem điểm sinh viên theo mã ID ");
        System.out.println("9. In ra danh sách sinh viên theo các mã môn học ");
        System.out.println("10. In ra sinh viên có điểm trung bình tất cả các môn cao nhất ");
        System.out.println("0. Thoát chương trình ");
    }
    public static void main(String args[]) {
        List <SinhVien> arrSinhVien = new ArrayList<>();
        List <MonHoc> arrMonHoc = new ArrayList<>();
        List <Diem> arrDiem = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        int option = -1;
        do {
            MainMenu();
            System.out.println("Chọn chức năng : [1- 10]");
            try {
                option = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println(e);
                continue;
            }
            //kiem tra nhap lua chon
            if (option < 1 || option > 10) {
                System.out.print("Lựa chọn không có");
                continue;
            }

            switch (option) {

                case 1:
                    System.out.println("Danh sách sinh viên");
                    if (arrSinhVien.size() == 0) {
                        System.out.println("Danh sách trống");
                        continue;
                    }
                    SinhVien s1 = new SinhVien("st123", "LMT", "21/05/1999","HN");
                    SinhVien s2 = new SinhVien("st233", "NTH", "23/03/1998", "TH");
                    SinhVien s3 = new SinhVien("f222", "DVH", "20/05/1999","HN");
                    arrSinhVien.add(s1);
                    arrSinhVien.add(s2);
                    arrSinhVien.add(s3);
                    System.out.printf("Danh sách %d sinh viên: \n", arrSinhVien.size());
                    for (SinhVien s : arrSinhVien ) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    System.out.println("Nhập thông tin sinh viên mới");
                    SinhVien s = new SinhVien();
                    System.out.print("Nhập mã sinh viên: ");
                    String idstudent = input.nextLine();
                    s.setId(idstudent);

                    System.out.print("Nhập tên sinh viên: ");
                    String namestudent = input.nextLine();
                    s.setName(namestudent);

                    System.out.print("Nhập ngày sinh: ");
                    String birthdaystudent = input.nextLine();
                    s.setBirthday(birthdaystudent);

                    System.out.print("Nhập quê quán: ");
                    String addressstudent = input.nextLine();
                    s.setAddress(addressstudent);
                    //them sv vao danh sach
                    arrSinhVien.add(s);

                    System.out.printf("Danh sách %d sinh viên: \n", arrSinhVien.size());
                    for (SinhVien sv : arrSinhVien ) {
                        System.out.println(sv);
                    }

                    break;
                case 3:
                    System.out.println("Tìm kiếm sinh viên theo ID");
                    System.out.print("Nhâp id sinh viên: ");
                    String idsinhvien = input.nextLine();
                    boolean check = false;

                    for (SinhVien sv : arrSinhVien ) {
                        if (sv.getId().equals(idsinhvien)) {
                            System.out.println(sv);
                            check = true;
                            break;
                        }
                    }
                    if (check == false) {
                        System.out.println("Khong co sinh vien can tim");
                    }
                    break;
                case 4:
                    System.out.println("Danh sách môn học.");

                    MonHoc mh1 = new MonHoc("mh1", "Math");
                    MonHoc mh2 = new MonHoc("mh2", "Physics");
                    MonHoc mh3 = new MonHoc("mh3", "Chemistry");
                    arrMonHoc.add(mh1);
                    arrMonHoc.add(mh2);
                    arrMonHoc.add(mh3);
                    for (MonHoc m : arrMonHoc ) {
                        System.out.println(m);
                    }
                    break;
                case 5:
                    System.out.println("Nhập thông tin môn học mới");
                    MonHoc mh = new MonHoc();
                    System.out.print("Nhap ma mon hoc: ");
                    String mamonhoc = input.nextLine();
                    mh.setIdSubject(mamonhoc);

                    System.out.print("Nhap ten mon hoc: ");
                    String tenmonhoc = input.nextLine();
                    mh.setNameSubject(tenmonhoc);

                    arrMonHoc.add(mh);
                    for (MonHoc m : arrMonHoc ) {
                        System.out.println(m);
                    }

                    break;
                case 6:
                    System.out.println("Nhập điểm môn học cho sinh viên ");
                    //kiểm tra mã sinh viên
                    System.out.print("Nhập mã sinh viên: ");
                    String maSV = input.nextLine();

                    boolean check1 = false;
                    boolean check2 = false;
                    for (SinhVien sv: arrSinhVien) {
                        if (sv.getId().equals(maSV)) {
                            check1 = true;
                            break;
                        }
                    } if (check1 == false) {
                    System.out.println("Không có sinh viên");
                    continue;
                    }
                    //kiểm tra môn học
                    System.out.print("Nhập mã môn học: ");
                    String maMH = input.nextLine();
                    for (MonHoc MH: arrMonHoc) {
                        if (MH.getIdSubject().equals(maMH)) {
                            check2 = true;
                            break;
                        }
                    } if (check2 == false) {
                    System.out.println("Không có môn học");
                    continue;
                    }
                    //nhập điểm
                    System.out.print("Nhập điểm môn học: ");
                    int diemMH = Integer.parseInt(input.nextLine());
                    Diem d = new Diem(maSV, maMH, diemMH);
                    //thêm vào arrDiem
                    arrDiem.add(d);
                    System.out.println(arrDiem);
                    break;
                case 7:
                    System.out.println("Cập nhật điểm cho sinh viên ");
                    //kiểm tra mã sinh viên
                    System.out.print("Nhập mã sinh viên: ");
                    String maSV1 = input.nextLine();

                    boolean check3 = false;
                    boolean check4 = false;
                    for (SinhVien sv: arrSinhVien) {
                        if (sv.getId().equals(maSV1)) {
                            check3 = true;
                            break;
                        }
                    } if (check3 == false) {
                    System.out.println("Không có sinh viên");
                    continue;
                    }
                    //kiểm tra môn học
                    System.out.print("Nhập mã môn học: ");
                    String maMH1 = input.nextLine();
                    for (MonHoc MH: arrMonHoc) {
                        if (MH.getIdSubject().equals(maMH1)) {
                            check4 = true;
                            break;
                        }
                    } if (check4 == false) {
                    System.out.println("Không có môn học");
                    continue;
                    }

                    //Cập nhật điểm
                    break;
                case 8:
                    System.out.println("Xem điểm sinh viên theo mã ID");
                    break;
                case 9:
                    System.out.println("In ra danh sách sinh viên theo các mã môn học");
                    break;
                case 10:
                    System.out.println("In ra sinh viên có điểm trung bình tất cả các môn cao nhất");
                    break;
                default:
                    System.out.println("Thoát chương trình");
                    cont = false;
                    break;
            }
        } while (option != 0);
    }
}

