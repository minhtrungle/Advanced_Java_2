package Exercises5.Ex2_JUNIT;

import Day5.Example1_Junit5.HinhTron;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class HinhVuongTest {
    @DisplayName("Test chu vi hình vuông")
    @ParameterizedTest(name = "{index} => Hình vuông có cạnh {0} có chu vi là {1} ")
    //"a, b" a là cạnh, b là chu vi thực
    @CsvSource({"1,4","2,8","1.234,4.94","2.345,9.38","23.432123,93.73","4.2,16.8","12.33,49.32","23,92"})
    void testChuVi(String edge, String expected) {
        double newEdge = Double.parseDouble(edge); //Chuyển string thành double
        double newExpected = Double.parseDouble(expected);//Giá trị đúng cần test lại

        HinhVuong hv = new HinhVuong();
        hv.setCanh(newEdge);

        double actual = hv.chuVi(); //Giá trị thực tế khi tính ra

        Assertions.assertEquals(newExpected, actual, 0.01); //Lấy chính xác 2 chữ số sau thập phân
    }

    @DisplayName("Test diện tích hình vuông")
    @ParameterizedTest(name = "{index} => Hình vuông có cạnh {0} có diện tích là {1}")
    @CsvSource({"1,1","2,4","1.234,1.53","2.345,5.5","23.432123,549.07","4.2,17.64","12.33,152.03","23,529"})
    void testDienTich(String edge, String expected) {
        double newEdge = Double.parseDouble(edge);
        double newExpected = Double.parseDouble(expected);

        HinhVuong hv = new HinhVuong();
        hv.setCanh(newEdge);

        double actual = hv.dienTich();

        Assertions.assertEquals(newExpected, actual, 0.01);
    }

    @DisplayName("In ra Exception khi cạnh không thõa mãn dương")
    @ParameterizedTest(name = "{index} => Hình vuông có cạnh {0} là không thõa mãn")
    @CsvSource({"0","-3.2848"})
    void printException(String edge) {
        double newEdge = Double.parseDouble(edge);

        Exception e = Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                HinhVuong hv = new HinhVuong(newEdge);
            }
        });
        String expected = "Cạnh phải là số dương";
        Assertions.assertEquals(expected, e.getMessage());
    }
}