package PracticeMySelfV2;

import java.util.Scanner;

public class MiddleOneCount {


    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");

        String word = scan.next();



        if (word.length() == 1) {
            System.out.print(word);
            System.out.print(word);
            System.out.print(word);
        }else if(word.length() % 2 != 0) {
            System.out.println(word.charAt(word.length() / 2));
        }else if (word.length() == 2) {
            System.out.print(word);
            System.out.print(word);
        } else if (word.length() % 2 == 0) {
            System.out.print(word.charAt(word.length() / 3));
            System.out.print(word.charAt(word.length() / 2));
        }
        }
    }
