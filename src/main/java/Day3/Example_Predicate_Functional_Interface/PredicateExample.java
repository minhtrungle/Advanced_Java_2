package Day3.Example_Predicate_Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //1 list String
        List<String> stringList = Arrays.asList("Hello", "Hello HoHo", "Hi");
        //Lọc ra những chuỗi có số từ lớn hơn 2 và có từ 'a'

        //Cần có 1 hàm -> tính được số từ
        //Function inteface là interface đơn giản với method nhận vào một tham số và trả về một giá trị.
        Function<String, Integer> demSoTu = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int count = 0;
                if (s.charAt(0) != ' ') {
                    count++;
                }
                for (int i = 1; i < s.length() - 1; i++) {
                    if (s.charAt(i) == ' ' && s.charAt(i) != ' ') {
                        count++;
                    }
                }
                return count;
            }
        };
        Predicate<String> soTuLonHon2 = s -> (demSoTu.apply(s) > 2);
        //Cần có 1 hàm để kiểm tra xem chuỗi có kí tự nào đó
        Predicate<String> kiemTraCoTuA = s -> (s.contains("a")); //constains để tìm kiếm trong chuỗi

        for (String str : stringList) {
            if (soTuLonHon2.test(str) && kiemTraCoTuA.test(str)) {
                System.out.println(str);
            }
        }
    }
}
