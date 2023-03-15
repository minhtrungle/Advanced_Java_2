package Day5.Example1_Junit5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class HinhTronTest {
    @Test
    @DisplayName("Hình tròn mặc định có bán kính = 1")
    public void banKinhMacDinh1() {
        HinhTron ht = new HinhTron();
        //Giá trị đúng
        double expected = 1.0;
        //Giá trị thực tế
        double actual = ht.getBanKinh();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Hình tròn có bán kính 1 chu vi là 6.283")
    public void testChuVi1() {
        HinhTron ht = new HinhTron(1);

        double expected = 6.283;

        double actual = ht.chuVi();

        Assertions.assertEquals(expected, actual, 0.001);// độ chính xác đến cs tp thứ 3

    }
    @Test
    @DisplayName("Hình tròn có bán kính 2.123 diện tích là 14.159")
    public void testDienTich1() {
        HinhTron ht = new HinhTron(2.123);

        double expected = 14.159;

        double actual = ht.dienTich();

        Assertions.assertTrue(Math.abs(expected - actual) < 0.001);//
        //14.159 và 14.1598 vẫn đúng êến cs thập phân thứ 3
    }
    @Test
    @DisplayName("Ném ra exception nếu khởi tạo hình tròn có bán kính bằng 0")
    public  void exception1() {
        Exception actualException = Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                HinhTron ht = new HinhTron(-4);
                ht.setBanKinh(0);
            }
        });
        String expected = "Error"; //Phải trùng với bên class HinhTron
        Assertions.assertEquals(expected, actualException.getMessage());
    }
    @Test
    @DisplayName("Nem ra exception neu set ban kinh hinh tron  bang 0")
    public void exception2(){
        Exception actualException = Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                // Viet code
                HinhTron hinhTron = new HinhTron(1);
                hinhTron.setBanKinh(0);
            }
        });

        String expected = "Error";
        Assertions.assertEquals(expected, actualException.getMessage());
    }
}