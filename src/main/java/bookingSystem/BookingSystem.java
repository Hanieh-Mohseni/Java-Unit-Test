package bookingSystem;

import com.hm.calculator.Calculator;

public class BookingSystem {

   private  String[] openingDays = {"Monday","Tuesday"};
   private  int bookingPrice=30;
   private Calculator calculator = new Calculator();

   public String[] getOpeningDays(){
       return  openingDays;
   }

   public boolean isOpen (String weekDay){
       if(!weekDay.endsWith("day")){
           throw new IllegalArgumentException("The weekDay argument must end in day");
       }
       if(weekDay.equals("Monday") || weekDay.equals("Tuesday"))
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
