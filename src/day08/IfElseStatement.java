package day08;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

                int speedLimit = 60;
                int yourSpeedLimit = 100;


                boolean IamSpeeding = yourSpeedLimit>speedLimit;

                if(IamSpeeding) {
                    System.out.println("A");
                    System.out.println("B");
                    System.out.println("C");
                    System.out.println("D");
                }else {
                    System.out.println("go to home");
                    System.out.println("go to homeS");
                    System.out.println("go too home");
                }
    }
}
