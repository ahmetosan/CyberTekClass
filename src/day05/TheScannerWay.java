package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {
        /*
        age calculator
        ask user for name
        and capture the result
        print your name is :
        ask for the birth year
        and capture the result
        print the age:
        ask user for height
        capture that result
        print the height
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Your name is "+ name);

        System.out.println("What is your birth year?");
        int  birthYear = scanner.nextInt();
        int urAge = 2019 - birthYear;
        System.out.println("Your age is " + urAge );

        System.out.println("what is your height?");
        float height = scanner.nextFloat();
        System.out.println("your height is "+ height);



    }
}
