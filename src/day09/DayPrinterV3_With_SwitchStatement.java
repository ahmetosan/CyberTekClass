package day09;

public class DayPrinterV3_With_SwitchStatement {
    public static void main(String[] args) {

           int dayCode = 7;

           switch (dayCode){
               case 1 :
                   System.out.println("Day is Monday");
                   break; //  use it for get out of this branch
               case 2:
                    System.out.println("Day is Tues");
                    break;
               case 3:
                     System.out.println("Day is Wed");
                    break;
               case 4:
                     System.out.println("Day is Thurs");
                    break;
               case 5:
                     System.out.println("Day is Friday");
                    break;
               case 6:
                     System.out.println("Day is Satudat");
                    break;
               case 7:
                     System.out.println("Day is Sunday");
                    break;
               default:
                     System.out.println("day is unknown");
           }
    }
}
