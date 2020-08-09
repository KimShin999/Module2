import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCaculatorTest {

    @Test
    void testfindAbsolute0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCaculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testfindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCaculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testfindAbsolute2() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCaculator.findAbsolute(number);
        assertEquals(expected, result);
    }

}