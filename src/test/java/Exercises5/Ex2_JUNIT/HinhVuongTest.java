package Exercises5.Ex2_JUNIT;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class HinhVuongTest {
    @Test
    @DisplayName("Hình vuông có cạnh là 1 chu vi là 4 ")
    void testChuVi1() {
        HinhVuong hv = new HinhVuong(1);

        double expected = 4;
        double actual = hv.chuVi();

        Assertions.assertEquals(expected, actual, 0.01); // chính xác đến chữ số thập phân thứ 2.
    }
}