package day03;

public class PrimitivesPractice {
    public static void main(String[] args) {


        byte letterCount = 26;
        System.out.println("The letter count is"+ letterCount);
        short sheepCount = 300;
        System.out.println("The sheep  count is"+ sheepCount);
        int catCount = 20;
        System.out.println("The cat count is"+ catCount);
        //--------------------------------------------------------------//

        long mileToSun = 100000000L;
        System.out.println("The mile to sun is"+ mileToSun);
        long mileToMoon = 500000;
        System.out.println("The mile to moon  is"+ mileToMoon);


        //----------------------------floating point -----------------

        float priceOfBanana = 1.99f; // you must add f to at the end number to indicate this is float data type
        System.out.println("The price of banana  is"+ priceOfBanana);
        float priceOfPotato = 2.49F; // uppercase or lower case doesnt matter, but is mandatory
        System.out.println("The price of the potato is"+ priceOfPotato);


        //------------------- larger floating point numbers-----------------------

        double priceOfIpad1 = 355.99d;
        System.out.println("The price of the i pad 1 is"+ priceOfIpad1);
        double priceOfIpadPro = 1024.99D; // comlier automatically assume it's a double so it;s not requred to have "d", however for good proggraming habbit add them always
        System.out.println("The price of ipad pro is"+ priceOfIpadPro);
        double priceOfMac = 2299.99;
        System.out.println("The price of macbook is "+ priceOfMac);
        // if you have a whole number by itself, compiler automatically assume it's an int
        // if you have a fractional  number by itself, compiler automatically assume it's an double



        }





    }

