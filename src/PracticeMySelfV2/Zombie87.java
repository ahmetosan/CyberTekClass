package PracticeMySelfV2;

import java.util.Scanner;

public class Zombie87 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        System.out.println("Day " + "0" + "[" + inhabitants + "]");
        for (int i = 1; i < inhabitants + i ; i++) {
            inhabitants = (inhabitants / 2);
            System.out.println("Day " + i + "[" + inhabitants + "]");
            if (inhabitants == 1) {
                System.out.println("---- EXTINCT ----");
                break;
            }
        }
    }}