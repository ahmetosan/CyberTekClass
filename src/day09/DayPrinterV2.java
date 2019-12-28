package day09;

public class DayPrinterV2 {
    public static void main(String[] args) {
           /*
        create a variable called dayCode as int

        *  if the daycode is 1 --->> Monday
        *  if the daycode is 2 --->>Tuesday
        *  if the daycode is 3 --->>Wednesday
         * if the daycode is 4 --->>Thursday
         * if the daycode is 5 --->>Friday
         * if the daycode is 6 --->>Saturday
         * if the daycode is 7 --->>Saturday
         * if none of the above just print unknown day
         *
        * */

           int dayCode = 2;
           String dayName = ""; // assinging a empty string value




           if(dayCode==1){
               dayName = "monday";
           }else if (dayCode==2){
               dayName = "tues";
           }else if (dayCode==3){
               dayName = "wed";
           }else if (dayCode==4){
               dayName = "thrs";
           }else if (dayCode==5){
               dayName = "frdy";
           }else if (dayCode==6){
               dayName = "stdrdy";
           }else if (dayCode==7){
               dayName = "sndy";
           }else {
               dayName = "unknown";
           }
        System.out.println(("day is "+ dayName));
    }

}
