package Exercises3.Ex2_Functional_Interface;

public class Main_Lambda_Expression {
    public static void main(String[] args) {
        //Viết theo lambda để code ngắn gọn hơn
        MyFunctional demSoKiTu = document -> document.length();
        //Lambda
        MyFunctional demSoKiTu2 = (document) -> document.length();
        System.out.println(demSoKiTu.calculator("lee"));
        System.out.println(demSoKiTu2.calculator("lee"));

        MyFunctional demSoTu = new MyFunctional() {
            @Override
            public long calculator(String document) {
                int count = 0;
                if (document.charAt(0) != ' '){
                    count ++;
                }
                for (int i = 0; i < document.length(); i++) {
                    if (document.charAt(i) == ' ' && document.charAt(i + 1) != ' ') {
                        count ++;
                    }
                }
                return count;
            }
        };
        System.out.println(demSoTu.calculator("le minh"));
        MyFunctional demSoTu2 = document -> {
            int count = 0;
            if (document.charAt(0) != ' '){
                count ++;
            }
            for (int i = 1; i < document.length() - 1; i++) {
                if (document.charAt(i) == ' ' && document.charAt(i + 1) != ' ') {
                    count ++;
                }
            }
            return count;
        };
        System.out.println(demSoTu2.calculator("le minh"));
    }
}
