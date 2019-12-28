package PracticeMySelfV2;

import java.util.Scanner;

public class FirstLastLetter89 {
    //DO NOT CHANGE

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        System.out.println((word.substring(0,1))+(word.charAt(word.length()-1)));
    }
}
