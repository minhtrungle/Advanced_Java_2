package Exercises3.Ex3_Stream;

public class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private int mark;

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String id, String name, int age, String gender, int mark) {
        if (mark < 0) {
            throw new RuntimeException("Error");
        }
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark < 0) {
            throw new RuntimeException("Error");
        }
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", mark=" + mark +
                ']';
    }
}
