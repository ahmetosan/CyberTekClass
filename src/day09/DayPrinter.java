package day09;

public class DayPrinter {
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

           if(dayCode==1){
               System.out.println("Day is Monday");
           }else if (dayCode==2){
               System.out.println("Day is Tues");
           }else if (dayCode==3){
               System.out.println("Day is Wed");
           }else if (dayCode==4){
               System.out.println("Day is Thurs");
           }else if (dayCode==5){
               System.out.println("Day is Friday");
           }else if (dayCode==6){
               System.out.println("Day is Satudat");
           }else if (dayCode==7){
               System.out.println("Day is Sunday");
           }else {
               System.out.println("this type is not in list");
           }
    }
}
