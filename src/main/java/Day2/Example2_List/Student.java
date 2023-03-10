package Day2.Example2_List;

public class Student implements Comparable <Student> {
    private int id;
    private  String name;
    private double mark;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                ']';
    }

    @Override
    public int compareTo(Student o) {
        if (this.mark > o.mark) {
            return 1;
        } else if (this.mark < o.mark) {
            return -1;
        }
        return 0;
    }
}
