package Day2.Example3_Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //Tạo 2 set chứa các chuỗi được nhập từ bàn phím
        Scanner in = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        while (true) {
            System.out.print("Enter string: ");
            String temp = in.nextLine();
            if (temp.equalsIgnoreCase("Exit") ) { //Kiểm tra nhập exit thì thoát
                break;
            }
            stringSet.add(temp);
            System.out.println(stringSet);
        }
        in.close();
    }
}
