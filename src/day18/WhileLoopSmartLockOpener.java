package day18;

import java.util.Scanner;

public class WhileLoopSmartLockOpener {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("knock knock");
        System.out.println("what is the password");

        String password = scan.next();


        while (! password.equals("B15")) {
            System.out.println("wring password try again");


            password= scan.next();
        }
        System.out.println("open seseame");

    }
}
