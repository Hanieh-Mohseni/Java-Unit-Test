package bookingSystem;

public class BookingSystem {

   private  String[] openingDays = {"Monday","Tuesday"};

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

}
