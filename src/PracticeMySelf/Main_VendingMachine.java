package PracticeMySelf;

import java.util.Scanner;

class Main_VendingMachine {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int itemPrice = 0, rest;
        int quarters, dimes, nickels; // quar = 25 dimes = 10  nickel = 5


        System.out.println("Enter price in cents:");
        itemPrice = object.nextInt();

        rest = 100 - itemPrice;

        quarters = (rest / 25);
        //quarters = remaingAmount%25;
        dimes = ((rest % 25) / 10);
        //dimes = remaingAmount%10;
        nickels = (((rest % 25) % 10) / 5);
        //nickels = remaingAmount%5;
        if (itemPrice%5 != 0){
            System.out.println("Invalid price!");
        }
          else if (itemPrice >= 25 && itemPrice <= 100) {
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
        } else if (itemPrice < 25 || itemPrice > 100) {
            System.out.println("Invalid price!");
        }
    }
}
