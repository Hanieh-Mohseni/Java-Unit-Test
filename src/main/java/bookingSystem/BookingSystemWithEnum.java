package bookingSystem;

import com.hm.calculator.Calculator;

import java.util.Arrays;

public class BookingSystemWithEnum {

    private  int bookingPrice=30;
    private Calculator calculator = new Calculator();
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    private  Day[] openingDays = {Day.MONDAY,Day.TUESDAY};


    public Day[] getOpeningDays(){
        return  openingDays;
    }

    public boolean isOpen (Day weekDay){
        if(!weekDay.toString().endsWith("DAY")){
            throw new IllegalArgumentException("The weekDay argument must end in day");
        }
        if(Arrays.asList(openingDays).contains(weekDay))
            return true;
        else
            return false;
    }

    public int getBookingPrice(){
        return bookingPrice;
    }

    public int applyDiscount(){
        return calculator.divide(bookingPrice,2)+5;
    }

}
