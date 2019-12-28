package day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);
        System.out.println("what is your name");
        String name = blabla.next();// it will capture only first wird separeted by space
        String anothetWord= blabla.next();
        System.out.println("you entered "+ name);
        System.out.println("another word is "+ anothetWord);




    }
}
