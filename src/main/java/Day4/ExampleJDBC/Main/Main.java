package Day4.ExampleJDBC.Main;

import Day4.ExampleJDBC.Dao.PersonDAO;
import Day4.ExampleJDBC.Model.Person;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        PersonDAO personDAO = new PersonDAO();

        //Lấy ra toàn bộ
        List<Person> personList = PersonDAO.getAll();
        System.out.println(personList);

        //Thêm 1 người vào database
        Person p = new Person();
        p.setName("LMT");
        p.setAddress("HN");
        p.setPhone("03333");
        p.setEmail("minhtrungle@");
        personDAO.insert(p);
    }
}
