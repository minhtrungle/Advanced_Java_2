package Exercises3.Ex2_Functional_Interface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập từ vào: ");
        String word = in.nextLine();
        MyFunctional numCharacters = new MyFunctional() {
            @Override
            public long calculator(String document) {
                return word.length();
            }
        };
        System.out.println("Chuỗi có số kí tự là: " + numCharacters.calculator(word));
        MyFunctional numWords = new MyFunctional() {
            @Override
            public long calculator(String document) {
                int count = 0;
//                boolean isword = false;
//                int endOfLine = document.length() - 1;
//
//                for (int i = 0; i < document.length(); i++) {
//                    if (Character.isLetter(document.charAt(i)) && i != endOfLine) {
//                        isword = true;
//                    } else if (!Character.isLetter(document.charAt(i)) && isword) {
//                        count++;
//                        isword = false;
//                    } else if (Character.isLetter(document.charAt(i)) && i == endOfLine) {
//                        count++;
//                    }
//                }
//                return count;
                //Cách 2
                // Khi nào bắt đầu 1 từ ?? i là khoảng trắng, i+1 ko phải khoảng trắng
                if (document.charAt(0) != ' '){
                    count ++;
                }
                for (int i = 1; i < document.length() - 1; i++) {
                    if (document.charAt(i) == ' ' && document.charAt(i + 1) != ' ') {
                        count ++;
                    }
                }
                return count;
            }
        };
        System.out.println("Số từ trong chuỗi là: " + numWords.calculator(word));
        MyFunctional numOf_a_and_A = new MyFunctional() {
            @Override
            public long calculator(String document) {
                char someChar1 = 'a';
                char someChar2 = 'A';
                int count = 0;
                for (int i = 0; i < document.length(); i++) {
                    if (document.charAt(i) == someChar1) {
                        count ++;
                    } else if (document.charAt(i) == someChar2) {
                        count ++;
                    }
                }
                return count;
            }
        };
        System.out.println("Số từ 'a', 'A' trong chuỗi là: " + numOf_a_and_A.calculator(word));
        MyFunctional numCharactersUse = new MyFunctional() {
            @Override
            public long calculator(String document) {
                int count  = 0;
                //String -> List -> sử dụng set để lấy k trùng
                Set<Character> characters = new HashSet<>();
                for (int i = 0; i < document.length(); i++) {
                    characters.add(document.charAt(i));
                    count = characters.size();
                }
                return count;
            }
        };
        System.out.println("số kí tự được sử dụng trong chuỗi là: " + numCharactersUse.calculator(word));
    }
}
