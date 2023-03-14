package Day4.ExampleJDBC.Dao;

import Day4.ExampleJDBC.Connection.MyConnection;
import Day4.ExampleJDBC.Model.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    //Thêm, sửa, xóa

    public static List<Person> getAll() throws SQLException {
        List<Person> personList = new ArrayList<>();

        try {
            // Bước 1: Tạo kết nối
            Connection conn = new MyConnection().getConnection();

            // Bước 2: Chuẩn bị câu lệnh
            String sql = "SELECT * FROM persons";

            // Bước 3: Thực thi và xem kết quả
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                //Tạo đối tượng Person rỗng
                Person p = new Person();
                p.setId(rs.getLong("id"));
                p.setName(rs.getString("name"));
                p.setAddress(rs.getString("address"));
                p.setPhone(rs.getString("phone"));
                p.setEmail(rs.getString("email"));

                personList.add(p);
            }
            // Bước 4: Đóng kết nối
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return personList;
    }

    public Person getById(long id) {
        return null;
    }

    public void insert(Person p) {
        try {
            Connection conn = MyConnection.getConnection();

            String sql = String.format("INSERT INTO `persons` (`name`,`address`,`phone`,`email`) VALUES ('%s','%s','%s','%s')",
                    p.getName(), p.getAddress(), p.getPhone(), p.getEmail()
            );

            Statement stmt = conn.createStatement();

            stmt.executeUpdate(sql); //update trong database

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Person p, long id) {

    }

    public void delete(long id) {
    }
}
