package bookingSystem;

import com.hm.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class BookingSystemTest {
    BookingSystem bookingSystem = new BookingSystem();

    @Test
    void getOpeningDays() {
        String[]expected = new String[]{"Monday","Tuesday"};
        String[] actual = bookingSystem.getOpeningDays();
        assertArrayEquals(actual,expected);
    }

    @Test
    void isOpenOnMonday() {
        boolean expected= true;
        boolean actual = bookingSystem.isOpen("Monday");
        assertEquals(expected,actual);
        //second way
        //assertTrue(bookingSystem.isOpen("Monday"));
    }

    @Test
    void isCloseOnWednesday() {
        assertFalse(bookingSystem.isOpen("Wednesday"));
    }

    @Test
    void exceptionIsThrownIfWeekDayDoesNotEndInDay() {
        Exception exception = assertThrows(IllegalArgumentException.class,()->bookingSystem.isOpen("Mon"));
        String expected = "The weekDay argument must end in day";
        String actual = exception.getMessage();
        assertEquals(expected,actual);

    }

    @Test
    void applyDiscount(){
        Calculator calculator = new Calculator();
        //By using assumption, if this part fail the test will skip the rest parts
        assumeTrue(calculator.divide(bookingSystem.getBookingPrice(),2)==15);

        int expected = 20;
        int actual = bookingSystem.applyDiscount();
        assertEquals(expected,actual);

    }

}