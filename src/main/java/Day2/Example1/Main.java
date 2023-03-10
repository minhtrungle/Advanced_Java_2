package Day2.Example1;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection <String> stringCollection = new ArrayList<>();
        //Them 1 String
        stringCollection.add("LMT");
        //In ra
        System.out.println(stringCollection);

        //Thay doi gia tri 1 phan tu theo index
        stringCollection.remove("LMT");
        //Lay ra kich thuoc
        System.out.println(stringCollection.size());
    }
}
