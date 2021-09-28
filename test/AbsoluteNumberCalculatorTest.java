import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void findAbsolute0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    //todo number là biến chứa giá trị đầu vào.
    // expected là biến chứa giá trị mong muốn. Trong trường hợp này giá trị tuyệt đối của 0 là 0.
    // result là biến chứa giá trị thực tế do phương thức findAbsolute() tính toán và trả về
    // phương thức assertEquals() được sử dụng để so sánh giá trị mong muốn và giá trị thực tế

    @Test
    void findAbsolute1() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    void findAbsolute2() {
        int number = 2;
        int expected = 4;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}