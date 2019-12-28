package PracticeMySelfV2;

import java.util.Scanner;

public class SwitchWeekDays {

        public static void main(String[] args) {

            //DO NOT CHANGE
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number:");
            int response = scan.nextInt();
            //WRITE YOUR CODE HERE

            switch (response) {
                case (1):
                    System.out.println("MONDAY");
                    break;
                case (2):
                    System.out.println("TUESDAY");
                    break;
                case (3):
                    System.out.println("WEDNESDAY");
                    break;
                case (4):
                    System.out.println("THURSDAY");
                    break;
                case (5):
                    System.out.println("FRIDAY");
                    break;
                case (6):
                    System.out.println("SATURDAY");
                    break;
                case (7):
                    System.out.println("SUNDAY");
                    break;
                default:
                    System.out.println("Invalid entry, please try again!");
                    break;


            }

        }
    }
