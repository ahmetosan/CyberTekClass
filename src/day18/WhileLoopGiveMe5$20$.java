package day18;

import java.util.Scanner;

public class WhileLoopGiveMe5$20$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please give me 5 or 20!!");

        int x = scan.nextInt();

        while (x!=5  && x!=20){
            System.out.println("NOT THE BILL I AM LOOKING FOR");
            System.out.println("GIVE ME 5 OR 20");
            x=scan.nextInt();
        }

        System.out.println("THE HAPPY ENDING !! GOT THE MONEY");

    }
}
