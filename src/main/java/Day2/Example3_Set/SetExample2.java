package Day2.Example3_Set;

import java.util.*;

public class SetExample2 {
    public static void main(String[] args) {
        Set<Car> carSet = new HashSet<>();
        Car c1 = new Car(1, "aaA");
        Car c2 = new Car(2, "aaB");

        carSet.add(c1);
        carSet.add(c2);
        // Cac doi tuong giong nhau -> khi hashcode giong nhau
        Car c3 = c1;
        System.out.println(c3.hashCode());
        System.out.println(c1.hashCode());

        carSet.add(c3);
        System.out.println(carSet);
        //Chuyển sang List
        List<Car> carList = new ArrayList<>();
        carList.addAll(carSet);
        System.out.println(carList);

        System.out.println(carList.get(0));

        /*Có 1 list các phần tử, bao gồm các giá trị trùng lặp
        * Tạo 1 list mới chỉ chứa các giá trị lặp 1 lần*/
        List<String> dulicateStringList = Arrays.asList("hello", "hi", "hello", "abc","hi");
        System.out.println(dulicateStringList);

        Set<String> tmpSet = new HashSet<>();
        System.out.println(tmpSet);

        List<String> newList = new ArrayList<>(tmpSet);
        System.out.println(newList);
    }
}
