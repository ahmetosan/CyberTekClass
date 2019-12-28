package day05;

public class AgeCalculator {
    public static void main(String[] args) {
        /*
        task 1 - age calculator
        give birth year, please calculator the age
         */

        int birthYear = 2001;
        int currentYear = 2019;
        int result = currentYear - birthYear;

        System.out.println("i was born year "+ birthYear + " and i am  "+ result + " years old");

        /*
        task 2 - you are speeding today
        speedin limit is some number, and your currenr speed is this
        generate this output of ; you are driving 10 mph more than speed limit
         */

        int urSpeed = 45;
        int spdLimit = 35;
        int resultSpeed = urSpeed - spdLimit;

        System.out.println("You are driving "+ resultSpeed +" more than speed limit which is "+spdLimit + " in city");

        /*

         */
    }
}
