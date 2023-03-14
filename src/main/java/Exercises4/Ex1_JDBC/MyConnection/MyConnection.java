package Exercises4.Ex1_JDBC.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class MyConnection {
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    //private static final String DB_URL = "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12605523";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/demo2_jdbc;";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
