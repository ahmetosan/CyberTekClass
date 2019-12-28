package PracticeMySelf;

import java.util.Scanner;

class Main_GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int giftCard = 100;
        int price1, price2, price3, price4, price5, price6, price7, price8, price9, price10;



        String product = scan.nextLine();

        price1 = 300;
        price2 = 400;
        price3 = 15;
        price4 = 10;
        price5 = 30;
        price6 = 50;
        price7 = 25;
        price8 = 5;
        price9 = 60;
        price10 = 40;




        if (product.contentEquals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if (product.contentEquals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");

        }else if (product.contentEquals("Charger") && price3 <= 100) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - price3) + "$");
        }else if (product.contentEquals("USB cable") && price4 <= 100) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - price4) + "$");
        }else if (product.contentEquals("Headphones") && price5 <= 100) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - price5) + "$");
        }else if (product.contentEquals("Pants") && price6 <= 100) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - price6) + "$");
        }else if (product.contentEquals("Hat") && price7 <= 100) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - price7) + "$");
        }else if (product.contentEquals("Socks") && price8 <= 100) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - price8) + "$");
        }else if (product.contentEquals("Blanket") && price9 <= 100) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - price9) + "$");
        }else if (product.contentEquals("Pillow") && price10 <= 100) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - price10) + "$");
        }else{
            System.out.println("Invalid item!");
        }


    }
}
