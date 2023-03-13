package Day3.Example2_Functional_Interface;

public class Main {
    public static void main(String[] args) {
        MyFunctional sum = new MyFunctional() {
            @Override
            public double calculator(double a, double b) {
                return a + b;
            }
        };
        System.out.println(sum.calculator(3.0, 4.0));
        //Muốn sử dụng thêm phương thức trừu tượng thì Định nghĩa 1 phương thức tính biểu thức
        MyFunctional expression = new MyFunctional() {
            @Override
            public double calculator(double a, double b) {
                return 5 * a + 3 * b;
            }
        };
        System.out.println(expression.calculator(1,4));
        //Thường định nghĩa trong trường hợp cần dùng
        //Thường kết hợp Stream API và Lambda expression
    }
}
