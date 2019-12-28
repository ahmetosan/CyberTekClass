package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);
        System.out.println("what is your name");

        String name = blabla.nextLine(); //  nextLine mothod scanner is used to capture whole line
        System.out.println("you have entered "+ name);



    }
}
