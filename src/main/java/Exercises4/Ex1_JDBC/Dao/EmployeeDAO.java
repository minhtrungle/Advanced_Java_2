package Exercises4.Ex1_JDBC.Dao;

import Day4.ExampleJDBC.Connection.MyConnection;
import Day4.ExampleJDBC.Model.Person;
import Exercises4.Ex1_JDBC.Model.Employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    //Lấy toàn bộ trong database
    public static List<Employee> getAllEmployee() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        Connection conn = new MyConnection().getConnection();
        try {
            String sql = "SELECT * FROM `employees`";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql); //select trả về kết quả

            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setFull_name(rs.getString("full_name"));
                employee.setCity(rs.getString("city"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                employee.setGender(rs.getInt("gender"));
                employee.setSalary(rs.getInt("salary"));

                employeeList.add(employee);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employeeList;
    }
    //Lấy theo id
    public Employee getByID(int id) throws SQLException {
        Connection conn = MyConnection.getConnection();
        try {
            String sql = "SELECT * FROM `employees` WHERE `id` = " +id;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Employee employee = null;
            if(rs.next()) {
                employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setFull_name(rs.getString("full_name"));
                employee.setCity(rs.getString("city"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                employee.setGender(rs.getInt("gender"));
                employee.setSalary(rs.getInt("salary"));
            }
            return employee;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    //Lấy theo tên
    public Employee getByName(String nameEmployee) throws SQLException {
        Connection conn = MyConnection.getConnection();
        try {
            String sql = "SELECT * FROM `employees` WHERE `full_name` = " + nameEmployee;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Employee employee = null;
            if(rs.next()) {
                employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setFull_name(rs.getString("full_name"));
                employee.setCity(rs.getString("city"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                employee.setGender(rs.getInt("gender"));
                employee.setSalary(rs.getInt("salary"));
            }
            return employee;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    //Thêm vào database
    public void insertEmployee(Employee emp) throws SQLException {
        Connection conn = MyConnection.getConnection();

        try {
            String sql = String.format("INSERT INTO `employees` (`full_name`,`city`,`email`,`phone`, `gender`, `salary`) VALUES ('%s','%s','%s','%s','%d','%d')",
                    emp.getFull_name(), emp.getCity(), emp.getEmail(), emp.getPhone(), emp.getGender(), emp.getSalary());

            Statement st = conn.createStatement();
            int rs  = st.executeUpdate(sql);
            if (rs == 0) {
                System.out.println("Thêm không thành công");
            }

            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Cập nhật database
    public void updateEmployee(Employee emp, int id) throws SQLException {
        Connection conn = MyConnection.getConnection();
        Employee empCheck = getByID(id);
        if (empCheck == null) {
            System.out.println("Không có người dùng trong database!");
            return;
        }
        try {
            String sql = String.format("UPDATE `employees` SET `full_name` = `%s`, `city` = `%s`, `email` = `%s`, `phone` = `%s`, `gender` = `%d`, `salary` = `%d` WHERE `id` = %d",
                    emp.getFull_name(), emp.getCity(), emp.getEmail(), emp.getPhone(), emp.getGender(), emp.getSalary(), id);

            Statement st = conn.createStatement();
            long rs = st.executeUpdate(sql);

            if (rs == 0) {
                System.out.println("Cập nhật thất bại");
            }

            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Xóa người dùng
    public void deleteEmployee(Employee emp, int id) throws SQLException {
        Connection conn = MyConnection.getConnection();
        Employee empCheck = getByID(id);
        if (empCheck == null) {
            System.out.println("Không có người dùng trong database!");
            return;
        }
        try {
            String sql = "DELETE FROM `persons` WHERE id = " + id;

            Statement st = conn.createStatement();
            long rs = st.executeUpdate(sql);

            if (rs == 0) {
                System.out.println("Xóa thất bại");
            }

            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
