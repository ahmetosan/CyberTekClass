package PracticeMySelf;

import java.util.Scanner;

public class Conditioanalv1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below


        if (num==0) {
            System.out.println();
        }else if (num<=-1) {
            System.out.println(num+" is negative");
        }else if(num>=1){
            System.out.println(num+" is positive");
        }

    }
}
