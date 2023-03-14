package Exercises4.Ex1_JDBC;

import Exercises4.Ex1_JDBC.Dao.EmployeeDAO;
import Exercises4.Ex1_JDBC.Model.Employee;

import java.sql.SQLException;

public class Main1 {
    public static void main(String[] args) throws SQLException {
        //Employee e = new Employee("LMT","HUST", "HN", "ass@gmail", "0941547268", 1, 100);

        EmployeeDAO employeeDAO = new EmployeeDAO();
        //employeeDAO.insertEmployee(e);

    }
}
