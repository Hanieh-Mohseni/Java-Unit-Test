package bookingSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

}