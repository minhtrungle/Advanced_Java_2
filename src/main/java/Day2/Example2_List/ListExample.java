package Day2.Example2_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    /*Tao 1 ArrayList luu tru thong tin cua sinh vien*/
    public static void main(String[] args) {
        List <Student> arrayList = new ArrayList<>();

        //them 2 sv
        Student s1 = new Student(1, "LMT", 8);
        arrayList.add(s1);
        Student s2 = new Student(2, "LMT2", 10);
        arrayList.add(s2);

        //im ra
        System.out.printf("Co %d ban sv \n", arrayList.size());
        System.out.println(arrayList);

        //thay doi ten ban s2
        Student s = arrayList.get(1);
        s.setName("LLM");
        System.out.println(arrayList);

        //thay the phan tu tai vi tri index = 1 (la s2)
        Student s3 = new Student(3, "ABC", 5);
        arrayList.set(1, s3);

//        //xoa phan tu theo index
//        arrayList.remove(0);
//        System.out.println(arrayList);
//
//        //xoa phan tu theo Object cu the
//        arrayList.remove(s3);
//        System.out.println(arrayList);

        //Sap xep cac phan tu
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
