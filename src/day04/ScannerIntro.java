package day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter your first name please;");
        String firstName = scan.next();
        System.out.println(" you have entered;  " + firstName);

        System.out.println("please entered your age");
        int age = scan.nextInt();
        System.out.println("you have entered the age;" + age);




    }


}
