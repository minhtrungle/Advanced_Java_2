package Day3.Example1_Map_Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Tạo map rỗng
        Map<Person, List<Car>> listMap = new HashMap<>();
        //Tạo 2 person
        Person p1 = new Person(1, "person1", "Male");
        Person p2 = new Person(2, "person2", "Female");
        //Tạo 3 car
        Car c1 = new Car(1, "Red", "Honda City");
        Car c2 = new Car(2, "White", "Volvo");
        Car c3 = new Car(3, "Blue", "Lexus");

        //p1 sở hữu xe gì?
        listMap.put(p1, Arrays.asList(c1));
        listMap.put(p2, Arrays.asList(c2));
        System.out.println(listMap);

        //p1 mua thêm xe c3
        //Lấy ra danh sách xe
        List<Car> p1List = new ArrayList<>(listMap.get(p1)); //Lưu 1 list mới
        p1List.add(c3);
        listMap.put(p1, p1List);
        System.out.println(listMap);

    }
}
