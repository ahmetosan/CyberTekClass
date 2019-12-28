package day05;

import java.util.Random;
import java.util.Scanner;

public class ScannerTempConvert {
    public static void main(String[] args) {

        Scanner tempConvert = new Scanner(System.in);
        System.out.println("what is the temp today?");
        double fahrenheit = tempConvert.nextDouble();

        double celsius = (5.0/9)*(fahrenheit-32);
        System.out.println("fahrenheit " + fahrenheit + " is "+ celsius + " in celsius");


    }
}
