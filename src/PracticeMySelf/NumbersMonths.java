package PracticeMySelf;

import java.util.Scanner;

class NumbersMonths { public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Enter month number:");
            int status = scan.nextInt();


            if (status == 1) {
                System.out.println("January");
            } else if (status == 2) {
                System.out.println("February");
            } else if (status == 3) {
                System.out.println("March");
            } else if (status == 4) {
                System.out.println("April");
            } else if (status == 5) {
                System.out.println("May");
            } else if (status == 6) {
                System.out.println("June");
            } else if (status == 7) {
                System.out.println("July");
            } else if (status == 8) {
                System.out.println("August");
            } else if (status == 9) {
                System.out.println("September");
            } else if (status == 10) {
                System.out.println("October");
            } else if (status == 11) {
                System.out.println("November");
            } else if (status == 12) {
                System.out.println("December");
            }
        }
    }
