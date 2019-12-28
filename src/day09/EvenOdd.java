package day09;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("what is the number you wanna share");
        int myNum;
        myNum = scan.nextInt();
        if (myNum % 2 == 0) {
        System.out.println("Number is even");
    } else
            System.out.println("Number is odd");
}
}
