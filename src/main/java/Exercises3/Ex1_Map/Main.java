package Exercises3.Ex1_Map;

import java.util.*;

public class Main {
    static Map<String , String> listMap = new HashMap<>(); //key la sdt, value là name
    public static void mainMenu() {
        System.out.println("1. Thêm danh bạ ");
        System.out.println("2. Cập nhật tên danh bạ ");
        System.out.println("3. Xoá danh bạ theo sdt ");
        System.out.println("4. Xem toàn bộ danh bạ ");
        System.out.println("5. Thoát ");
    }
    private static void option1(Scanner in) {
        //Nhập số điện thoại
        System.out.println("\tNhập số điện thoại: ");
        String sdt = in.nextLine();
        //Kiểm tra sdt đã tồn tại hay chưa
        if (listMap.containsKey(sdt)) { //Kiểm tra theo key
            System.out.println("Đã tồn tại!");
            return;
        }
        System.out.println("Nhập tên: ");
        String hoTen = in.nextLine();
        //Nếu chưa có thì nhập tên lưu danh bạ
        listMap.put(sdt, hoTen);
        System.out.println("Thêm danh bạ thành công!");

    }
    private static void option2(Scanner in) {
        //Nhập số điện thoại
        System.out.println("\tNhập số điện thoại: ");
        String sdt = in.nextLine();
        //Kiểm tra sdt đã tồn tại hay chưa
        if (listMap.containsKey(sdt)) {
            System.out.println("Đã tồn tại!");
        }
        String hoTenCu = listMap.get(sdt);
        System.out.println("Tên muốn cập nhật là: " + hoTenCu);
        System.out.println("Nhập tên cập nhật mới: ");
        String hoTenMoi = in.nextLine();

        //lưu danh bạ
        listMap.replace(sdt, hoTenMoi);
        System.out.println("Cập nhật danh bạ thành công!");
    }
    private static void option3(Scanner in) {
        //Nhập số điện thoại
        System.out.println("\tNhập số điện thoại muốn xóa: ");
        String sdt = in.nextLine();
        //Kiểm tra sdt đã tồn tại hay chưa
        if (listMap.containsKey(sdt)) {
            System.out.println("Đã tồn tại!");
            return;
        }
        String hoTen = listMap.get(sdt);

        //Xóa tên trong danh bạ
        listMap.remove(sdt, hoTen);
        System.out.println("Xóa danh bạ thành công!");
    }
    public static void main(String[] args) {

        List<FullName> listName = new ArrayList<>();
        List<PhoneNumber> listPhone = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        FullName fullName = new FullName();
        PhoneNumber pNumber = new PhoneNumber();
        int index = -1;
        do {
            mainMenu();
            System.out.println("Chọn chức năng [1-5] ");
            try {
                index = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println(e);
            }
            if (index <= 0 || index > 5) {
                System.out.println("Chức năng không có ");
                continue;
            }
            switch (index) {
                case 1:
//                    System.out.println("1. Thêm danh bạ ");
//                    System.out.println("Nhập số người muốn thêm: ");
//                    int n = in.nextInt();
//                    for (int i = 0; i < n; i++) {
//                        System.out.println("Nhập tên người muốn thêm: ");
//                        String fistname = in.nextLine();
//                        fullName.setFistName(fistname);
//                        String lastname = in.nextLine();
//                        fullName.setFistName(lastname);
//                        listName.add(fullName);
//
//                        System.out.println("Nhập số điện thoại");
//                        String number = in.nextLine();
//                        pNumber.setPhoneNumber(number);
//                        listPhone.add(pNumber);
//                        boolean check = false;
//                        for (PhoneNumber PN : listPhone) {
//                            if (PN.getPhoneNumber().equals(number)) {
//                                check = true;
//                                break;
//                            }
//                        }
//                        listMap.put(fullName, pNumber);
//                        if (check == false) {
//                            System.out.println("Số điện thoại đã tồn tại!");
//                        }
//                    }
//                    System.out.println(listMap);
                    option1(in);
                    break;

                case 2:
                    System.out.println("2. Cập nhật tên danh bạ ");
                    option2(in);
                    break;
                case 3:
                    System.out.println("3. Xoá danh bạ theo sdt ");
                    option3(in);
                    break;
                case 4:
                    System.out.println("4. Xem toàn bộ danh bạ ");
                    for (String phone : listMap.keySet()) {
                        System.out.printf("%s - %s \n", listMap.get(phone), phone);
                    }
                    break;

                default:
                    System.out.println("Exit");
                    break;
            }
        } while (index != 0);
    }
}
