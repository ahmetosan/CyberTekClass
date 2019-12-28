package PracticeMySelf;

import java.util.Scanner;

class ApartmentLeasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double giftCard = 100;
        int price1, price2, price3;



       int numberOfBedrooms = scan.nextInt();

        price1 = 1100;
        price2 = 1850;
        price3 = 2550;

        if (numberOfBedrooms == 1) {
            System.out.println("One Bedroom Selected");
            System.out.println("set startingPrice as "+ price1);
        }
        else if (numberOfBedrooms == 2) {
            System.out.println("One Bedroom Selected");
            System.out.println("set startingPrice as "+ price2);
        }
        else if (numberOfBedrooms == 3) {
            System.out.println("One Bedroom Selected");
            System.out.println("set startingPrice as "+ price3);
        }else{
            System.out.println("No such Bedrooms available");
        }

        System.out.println("Starting Price: value");


    }
}
