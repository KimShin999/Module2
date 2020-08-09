import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDaycaculatorTest {


    @Test
    void checkLeapYear() {
        int year = 2020;
        boolean expected = true;
        boolean result = NextDaycaculator.checkLeapYear(year);
        assertEquals(expected, result);
    }

    @Test
    void checkLastDay() {
        NextDaycaculator.checkLeapYear(2020);
        String expected = 29 + " __________ " + 2;
        String result = NextDaycaculator.lastDayOfMonth(28,2);
        assertEquals(expected, result);
    }

}