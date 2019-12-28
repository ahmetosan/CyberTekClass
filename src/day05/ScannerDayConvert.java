package day05;

import java.util.Scanner;

public class ScannerDayConvert {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //-------------- day to minutes
        System.out.println("How many days you want to make it in minute?");
        int day = scan.nextInt();
        int minute = (day*(24*60));
        System.out.println("I can tell you that " + day + " day is "+ minute + " minutes");

        // ----------- your wage
        System.out.println("Enter your hourly wage ");
        double hourlyWage = scan.nextDouble();
        double yearlyWage=hourlyWage*2080;
        System.out.println("So you earn "+yearlyWage+ " dollars per year.");

        //----------- grocery

        System.out.println("What is the price of tomato? ");
        double tomatoPrice = scan.nextDouble();
        System.out.println("How many pounds of tomato you want ? ");
        double tomatoPound = scan.nextDouble();
        System.out.println("What is the price of banana? ");
        double bananaPrice = scan.nextDouble();
        System.out.println("How many pounds of banana you want ? ");
        double bananaPound = scan.nextDouble();
        System.out.println("What is the price of apple? ");
        double applePrice = scan.nextDouble();
        System.out.println("How many pounds of apple you want ? ");
        double applePound = scan.nextDouble();
        System.out.println("You buy"+tomatoPound+" pounds of tomato and the price is "+tomatoPrice+ " dollars.");
        System.out.println("You buy"+bananaPound+" pounds of banana and the price is "+bananaPrice+ " dollars.");
        System.out.println("You buy"+applePound+" pounds of apple and the price is "+applePrice+ " dollars.");
    }
}

