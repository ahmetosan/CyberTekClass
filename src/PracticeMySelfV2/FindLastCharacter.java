package PracticeMySelfV2;

import java.util.Scanner;

public class FindLastCharacter {


    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");

        String word = scan.nextLine();


        System.out.println(word.charAt(word.length()-1));

    }
}