package Exercises3.Ex3_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("st1", "LMT", 24, "Male", 9);
        Student st2 = new Student("st2", "LMT2", 23, "Female", 8);
        Student st3 = new Student("st3", "LMT3", 22, "Male", 10);
        Student st4 = new Student("st4", "LMT4", 22, "FeMale", 10);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);

        //Tuổi trung bình
        final double[] t = {0};
        studentList.stream().forEach(new Consumer<Student>() { //forEach lặp để tính tổng
            @Override
            public void accept(Student student) {
                t[0] = t[0] + student.getAge();
            }
        });
        System.out.println("Điểm trung bình: " + t[0] / studentList.size());
//        Function<List<Student>, Double> listFunction = new Function<List<Student>, Double>() {
//            @Override
//            public Double apply(List<Student> students) {
//                students.add(st1);
//                students.add(st2);
//                students.add(st3);
//                students.add(st4);
//                int Sum = 0;
//                double tuoiTB = 0;
//                for (int i = 0; i < students.size(); i++) {
//                    Sum += students.get(i).getAge();
//                }
//                tuoiTB = Sum / students.size();
//                return tuoiTB;
//            }
//        };
//        System.out.println("Tuổi trung bình các bạn sv là: " + listFunction.apply(s));

        //In ra các bạn là nam va điểm lớn hơn 8 và tên có từ a.
        studentList.stream().filter(new Predicate<Student>() { //filter lọc ra
            @Override
            public boolean test(Student student) {
                if (student.getGender().equals("Male") && student.getMark() > 8) {
                    return true;
                }
                return false;
            }
        }).forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });
        //cách 2 lambda
        //filter lọc ra
//        studentList.stream().filter(s -> s.getGender().equals("Male") && s.getMark() > 8)
//                .filter(s -> s.getName().toLowerCase().contains("a"))
//        .forEach(System.out::println);


        //Tạo danh sách chỉ có các bạn nữ
        List<Student> newListStudent = studentList.stream().filter(new Predicate<Student>() {

            @Override
            public boolean test(Student student) {
                if (student.getGender().equalsIgnoreCase("FeMale")) {
                    return true;
                }
                return false;
            }
        })
                .collect(Collectors.toList());
        System.out.println(newListStudent);

        //Cách 2 Lambda
//        List<Student> newListStudent = studentList.stream()
//                .filter(student -> (student.getGender().equalsIgnoreCase("FeMale")))
//                .collect(Collectors.toList());
//        System.out.println(newListStudent);
//        System.out.println(studentList);
    }
}
