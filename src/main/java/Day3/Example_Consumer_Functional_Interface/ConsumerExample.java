package Day3.Example_Consumer_Functional_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(1.5);
        numbers.add(2.0);
        numbers.add(3.0);
        //Duyệt list và in ra giá trị biểu thức y = 3x^2+5x-1
        Consumer<Double> y = x -> {
            double y1 = 3 * x * x + 5 * x -1;
            System.out.println(y1);
        };
        for ( double n : numbers) {
            y.accept(n);
        }

        //Tăng giá trị number lên gấp đôi
        Consumer<List<Double>> f = new Consumer<List<Double>>() {

            @Override
            public void accept(List<Double> doubles) {
                for (int i = 0; i < doubles.size(); i++) {
                    doubles.set(i, 2 * doubles.get(i));
                }
            }
        };
        //lambda
//        Consumer<List<Double>> f = doubles -> {
//            for (int i = 0; i < doubles.size(); i++) {
//                doubles.set(i, 2 * doubles.get(i));
//            }
//        };
        System.out.println(numbers);
        f.accept(numbers);
        System.out.println(numbers);
    }
}
