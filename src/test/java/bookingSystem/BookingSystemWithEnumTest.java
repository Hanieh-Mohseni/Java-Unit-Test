package bookingSystem;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class BookingSystemWithEnumTest {
    BookingSystemWithEnum bookingSystemWithEnum= new BookingSystemWithEnum();

    @Test
    void getOpeningDays(){
        BookingSystemWithEnum.Day[] expected = new BookingSystemWithEnum.Day[]{BookingSystemWithEnum.Day.MONDAY, BookingSystemWithEnum.Day.TUESDAY};
        BookingSystemWithEnum.Day[] actual = bookingSystemWithEnum.getOpeningDays();
        assertArrayEquals(expected,actual);

    }

    @ParameterizedTest
    @EnumSource(value = BookingSystemWithEnum.Day.class, names={"MONDAY", "TUESDAY"})
    public void isOpen(BookingSystemWithEnum.Day day) {
        assertTrue(bookingSystemWithEnum.isOpen(day));
    }

    @ParameterizedTest
    @EnumSource(value = BookingSystemWithEnum.Day.class, names={"WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY","SUNDAY"})
    public void isClose(BookingSystemWithEnum.Day day) {
        assertFalse(bookingSystemWithEnum.isOpen(day));
    }

    @Test
    public  void testNull(){
        assertFalse(bookingSystemWithEnum.isOpen(null));
    }
}