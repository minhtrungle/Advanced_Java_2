package Exercises4.Ex1_JDBC.Data;

import Exercises4.Ex1_JDBC.Dao.EmployeeDAO;
import Exercises4.Ex1_JDBC.Model.Employee;
import com.github.javafaker.Faker;

import java.sql.SQLException;
import java.util.Locale;

public class FakeData {
    public static void main(String[] args) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        Faker faker = new Faker(new Locale("vi"));

        for (int i = 0; i < 100; i++) {
            Employee e = new Employee();
            e.setFull_name(faker.name().nameWithMiddle());
            e.setPhone(faker.phoneNumber().phoneNumber());
            e.setCity(faker.address().cityName());
            e.setGender(faker.number().numberBetween(0, 2));
            e.setSalary(faker.number().numberBetween(1000, 2000));
            e.setEmail("a" + faker.number().numberBetween(100, 1000) + "abc" + faker.number().numberBetween(100, 1000) + "@gmail");

            employeeDAO.insertEmployee(e);
        }
    }
}
