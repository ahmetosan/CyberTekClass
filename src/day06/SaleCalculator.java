package day06;

import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  double regularPrice;
        //  double salePrice;
        //  double discount;
        double regularPrice, salePrice, discount;

        System.out.println("What is the regular price");
        regularPrice = scanner.nextDouble();

        System.out.println("what is the discount");
        discount = scanner.nextDouble();

        salePrice = regularPrice - regularPrice*discount;



        System.out.println(regularPrice+"$ is regular price and now we have "+discount+" off.Now you can buy "+ salePrice);

    }
}
