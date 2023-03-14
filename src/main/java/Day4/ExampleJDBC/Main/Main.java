package Day4.ExampleJDBC.Main;

import Day4.ExampleJDBC.Dao.PersonDAO;
import Day4.ExampleJDBC.Model.Person;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void MainMeNu() {
        System.out.println("1. Thêm dữ liệu vào database");
        System.out.println("2. Lấy toàn bộ dữ liệu từ database");
        System.out.println("3. Cập nhật dữ liệu vào database");
        System.out.println("4. Lấy dữ liệu theo id từ database");
        System.out.println("5. Xóa dữ liệu trong database");
        System.out.println("6. Thoát");
    }
    public static void main(String[] args) throws SQLException {

        Scanner in = new Scanner(System.in);
        PersonDAO personDAO = new PersonDAO();
        Person p = new Person();

        int index = -1;
        do {
            MainMeNu();
            System.out.println("Chọn chức năng [1-6]");
            try {
                index = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (index < 1 || index > 6) {
                System.out.println("Không có chức năng nào phù hợp");
                continue;
            }
            switch (index) {
                case 1:
                    System.out.println("1. Thêm dữ liệu vào database");

                    System.out.println("Nhập tên muốn thêm: ");
                    String tenMoi = in.nextLine();
                    p.setName(tenMoi);

                    System.out.println("Nhập địa chỉ muốn thêm: ");
                    String diaChiMoi = in.nextLine();
                    p.setAddress(diaChiMoi);

                    System.out.println("Nhập sđt muốn thêm: ");
                    String sdtMoi = in.nextLine();
                    p.setPhone(sdtMoi);

                    System.out.println("Nhập email muốn thêm: ");
                    String emailMoi = in.nextLine();
                    p.setName(emailMoi);

                    in.close();

                    personDAO.insert(p);
                    break;
                case 2:
                    System.out.println("2. Lấy toàn bộ dữ liệu từ database");
                    List<Person> personList = PersonDAO.getAll();
                    System.out.println(personList);
                    break;
                case 3:
                    System.out.println("3. Cập nhật dữ liệu vào database");

                    //Nhập id nếu tìm thấy thì in ra
                    System.out.println("Nhập id cần tìm");
                    long id  = Long.parseLong(in.nextLine());

                    System.out.println("Nhập tên muốn cập nhật: ");
                    String tenMoi1 = in.nextLine();
                    p.setName(tenMoi1);

                    System.out.println("Nhập địa chỉ muốn cập nhật: ");
                    String diaChiMoi1 = in.nextLine();
                    p.setAddress(diaChiMoi1);

                    System.out.println("Nhập sđt muốn cập nhật: ");
                    String sdtMoi1 = in.nextLine();
                    p.setPhone(sdtMoi1);

                    System.out.println("Nhập email muốn cập nhật: ");
                    String emailMoi1 = in.nextLine();
                    p.setName(emailMoi1);

                    in.close();

                    personDAO.update(p, id);
                    break;
                case 4:
                    System.out.println("4. Lấy dữ liệu theo id từ database");

                    //Nhập id nếu tìm thấy thì in ra
                    System.out.println("Nhập id cần tìm");
                    long id1  = Long.parseLong(in.nextLine());
                    personDAO.getById(id1);
                    break;
                case 5:
                    System.out.println("5. Xóa dữ liệu trong database");
                    //Nhập id nếu tìm thấy thì in ra
                    System.out.println("Nhập id cần tìm");
                    long id2  = Long.parseLong(in.nextLine());
                    personDAO.delete(id2);
                    break;
                default:
                    break;
            }
        } while (index != 0);


        Person p1 = new Person("Le Minh trung","HUST","021234","lmt@gmail.com");

        personDAO.insert(p1);


    }
}
