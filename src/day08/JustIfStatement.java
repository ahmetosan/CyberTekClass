package day08;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("what is your current speed?");
                //int speedLimit = 60;
                //int yourSpeedLimit = 100;
                int currentSpeed = scan.nextInt();
                System.out.println("what is speed limit");
                int speedLimit = scan.nextInt();

                //boolean IamSpeeding = yourSpeedLimit>speedLimit;

                if(currentSpeed>=speedLimit) {
                    System.out.println("A");
                    System.out.println("B");
                    System.out.println("C");
                    System.out.println("D");
                } /*else {
                    System.out.println("go to home");
                    System.out.println("go to homeS");
                    System.out.println("go too home");
                }*/
    }
}
