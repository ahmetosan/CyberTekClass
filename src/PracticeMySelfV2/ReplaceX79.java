package PracticeMySelfV2;

import java.util.Scanner;

public class ReplaceX79 {


    public static void main(String[] args) {
        //DO NOT CHANGE
        // Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter the text:");

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length=word.length()-1;

        if(word.substring(0,1).equalsIgnoreCase("x") && word.substring(length).equalsIgnoreCase("x") ){
            System.out.println(      word.substring(1,(word.length()-1))        );}
        else if(word.substring(0,1).equalsIgnoreCase("x") ){
            System.out.println(      word.substring(1,word.length()) );}
        else if  (word.substring(word.length()-1).equalsIgnoreCase("x")   )
        {
            System.out.println( word.substring(0,word.length()-1) );
        }
        else{System.out.println(word);}
    }
}