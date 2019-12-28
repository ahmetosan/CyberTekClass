package PracticeMySelfV2;

import java.util.Scanner;

public class CaseIgnoreUpperLower {


        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter full name:");

            String sentence = scan.nextLine();
            //WRITE YOUR CODE HERE


            if (sentence.equalsIgnoreCase("Max Payne") || sentence.equalsIgnoreCase("Alan Wake")){
                System.out.println("User found!");
            }else{
                System.out.println("User not found!");
            }

        }
    }