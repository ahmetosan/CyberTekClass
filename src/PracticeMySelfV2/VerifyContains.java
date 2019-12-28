package PracticeMySelfV2;

import java.util.Scanner;

public class VerifyContains {


    public static void main(String[] args) {
        //DO NOT CHANGE
       // Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter the text:");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE

        if (sentence.contains(word)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
