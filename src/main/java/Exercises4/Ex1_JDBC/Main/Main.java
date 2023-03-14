package Exercises4.Ex1_JDBC.Main;

import Day4.ExampleJDBC.Model.Person;
import Exercises4.Ex1_JDBC.Dao.EmployeeDAO;
import Exercises4.Ex1_JDBC.Model.Employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void MeNu() {
        System.out.println("---- QUẢN LÝ NHÂN SỰ ----");
        System.out.println("1. Thêm nhân viên");
        System.out.println("2. Danh sách nhân viên (sắp xếp theo họ tên - abc)");
        System.out.println("3. Tìm kiếm nhân viên theo tên");
        System.out.println("4. Cập nhật thông tin nhân viên");
        System.out.println("5. Xoá nhân viên theo mã");
        System.out.println("6. Lọc ra top 5 lương cao nhất");
        System.out.println("7. In ra trung bình mức lương của nhân viên nữ");
        System.out.println("8. Thoát");
    }
    private static void option1(Scanner input) throws SQLException {
        Employee emp = new Employee();
        EmployeeDAO employeeDAO = new EmployeeDAO();
        System.out.println("Nhập tên muốn thêm: ");
        String tenMoi = input.nextLine();
        emp.setFull_name(tenMoi);

        System.out.println("Nhập địa chỉ muốn thêm: ");
        String diaChiMoi = input.nextLine();
        emp.setCity(diaChiMoi);

        System.out.println("Nhập email muốn thêm: ");
        String emailMoi = input.nextLine();
        emp.setEmail(emailMoi);

        System.out.println("Nhập sđt muốn thêm: ");
        String sdtMoi = input.nextLine();
        emp.setPhone(sdtMoi);

        System.out.println("Nhập giới tính muốn thêm: ");
        int gtMoi = input.nextInt();
        emp.setGender(gtMoi);

        System.out.println("Nhập lương muốn thêm: ");
        int luongMoi = input.nextInt();
        emp.setSalary(luongMoi);
        input.close();

        employeeDAO.insertEmployee(emp);
        System.out.println("Thêm nhân viên thành công");
    }

    private static void option2() throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        List<Employee> employeeList = employeeDAO.getAllEmployee();
        employeeList.stream()
                        .sorted(new Comparator<Employee>() {
                            @Override
                            public int compare(Employee o1, Employee o2) {
                                return o1.getFull_name().compareTo(o2.getFull_name());
                            }
                        })
                        .forEach(employee -> System.out.println(employee));
    }
    private static void option3(Scanner input) throws SQLException {
        List<Employee> employeeList = EmployeeDAO.getAllEmployee();
        EmployeeDAO employeeDAO = new EmployeeDAO();
        System.out.println("Nhập tên muốn tìm: ");
        String ten = input.nextLine();
        employeeDAO.getByName(ten);
//        employeeList.stream()
//                        .filter(employee -> employee.getFull_name() == ten)
//                                .forEach(employee -> System.out.println(employeeList));
    }

    private static void option4(Scanner input) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee emp = new Employee();
        System.out.println("Nhập id muốn cập nhật: ");
        int idemp = Integer.parseInt(input.nextLine());

        System.out.println("Nhập tên muốn thêm: ");
        String tenMoi = input.nextLine();
        emp.setFull_name(tenMoi);

        System.out.println("Nhập địa chỉ muốn thêm: ");
        String diaChiMoi = input.nextLine();
        emp.setCity(diaChiMoi);

        System.out.println("Nhập email muốn thêm: ");
        String emailMoi = input.nextLine();
        emp.setEmail(emailMoi);

        System.out.println("Nhập sđt muốn thêm: ");
        String sdtMoi = input.nextLine();
        emp.setPhone(sdtMoi);

        System.out.println("Nhập giới tính muốn thêm: ");
        int gtMoi = input.nextInt();
        emp.setGender(gtMoi);

        System.out.println("Nhập lương muốn thêm: ");
        int luongMoi = input.nextInt();
        emp.setSalary(luongMoi);
        input.close();

        employeeDAO.updateEmployee(emp, idemp);
        System.out.println("Cập nhật nhân viên thành công");
    }

    private static void option5(Scanner input) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee emp = new Employee();
        System.out.println("Nhập id muốn xóa: ");
        int idemp = Integer.parseInt(input.nextLine());
        employeeDAO.deleteEmployee(idemp);
        System.out.println("Xóa thành công");
    }
    private static void option6() throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        List<Employee> employeeList = employeeDAO.getAllEmployee();
        employeeList.stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        if (o1.getSalary() < o2.getSalary()) {
                            return 1;
                        } else if (o1.getSalary() > o2.getSalary()) {
                            return -1;
                        }
                        return 0;
                    }
                })
                .limit(5)
                .forEach(employee -> System.out.println("Mã nhân viên " + employee.getId() + "Tên nhân viên " + employee.getFull_name() + "Lương " + employee.getSalary())
                );
    }

    private static void option7() throws SQLException {
        final double[] tongLuong = {0};
        final int[] soNguoi = {0};
        EmployeeDAO employeeDAO = new EmployeeDAO();
        List<Employee> employeeList = employeeDAO.getAllEmployee();
        employeeList.stream()
                .filter(employee -> employee.getGender() == 0)
                .forEach(new Consumer<Employee>() {
                    @Override
                    public void accept(Employee employee) {
                        tongLuong[0] += employee.getSalary();
                        soNguoi[0]++;
                    }
                });
        System.out.println("Trung bình lương" + tongLuong[0] / soNguoi[0]);

    }
    public static void main(String[] args) throws SQLException {
        MeNu();
        System.out.println("Chọn chức năng [1-6]");
        List<Employee> employeeList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int index = -1;
        do {
            try {
                index = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Không có chức năng!");
            }
            if (index < 1 || index > 6) {
                System.out.println("Không có chức năng!");
                continue;
            }
            switch (index) {
                case 1:
                    System.out.println("1. Thêm nhân viên");
                    option1(input);
                    break;
                case 2:
                    System.out.println("2. Danh sách nhân viên");
                    option2();
                    break;
                case 3:
                    System.out.println("3. Tìm kiếm nhân viên theo tên");
                    option3(input);
                    break;
                case 4:
                    System.out.println("4. Cập nhật thông tin nhân viên");
                    option4(input);
                    break;
                case 5:
                    System.out.println("5. Xoá nhân viên theo mã");
                    option5(input);
                    break;
                case 6:
                    System.out.println("6. Lọc ra top 5 lương cao nhất");
                    option6();
                    break;
                case 7:
                    System.out.println("7. In ra trung bình mức lương của nhân viên nữ");
                    option7();
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
        } while (index != 0);
    }
}
