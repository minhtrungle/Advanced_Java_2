package Exercises4.Ex1_JDBC.Model;

public class Employee {
    private int id;
    private String full_name;
    private String city;
    private String email;
    private String phone;
    private int gender;
    private int salary;

    public Employee() {
    }

    public Employee(String full_name, String city, String email, String phone, int gender, int salary) {
        if (salary < 0) {
            throw new RuntimeException("Error");
        }
        this.full_name = full_name;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee(int id, String full_name, String city, String email, String phone, int gender, int salary) {
        if (salary < 0) {
            throw new RuntimeException("Error");
        }
        this.id = id;
        this.full_name = full_name;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            throw new RuntimeException("Error");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ']';
    }
}
