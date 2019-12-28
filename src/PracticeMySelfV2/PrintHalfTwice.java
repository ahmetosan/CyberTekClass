package PracticeMySelfV2;

import java.util.Scanner;

public class PrintHalfTwice {


    public static void main(String[] args) {
        //DO NOT CHANGE
       // Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter the text:");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int half = word.length()/2;

        System.out.print(word.substring(0,half)+word.substring(0,half));

    }
}
