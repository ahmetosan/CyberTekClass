package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {


        Scanner blabla = new Scanner(System.in);

        System.out.println("what is your name");
        String name = blabla.nextLine();
        System.out.println("your name is" + name);

        System.out.println("what is your age");
        int age = blabla.nextInt();
        //notice we are not storing this into variable
        // we just want below line to capture enter keyboard input
        //so that it does not accidentally get captured by
        //the next Line we use to capture adress
        blabla.nextLine();// this line kill the enter and goes for next wuestions
        System.out.println("your name is" + age);

        System.out.println("what is your adress");
        String adress = blabla.nextLine();
        System.out.println("your name is" + adress);

    }
}
