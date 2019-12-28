package day07;

public class Casting {

    public static void main(String[] args) {

        //int num = 10;


        //implicitly ( automatically) converted to double
        double bigNum = 10;
        System.out.println(bigNum);

        int num = (int) 12.99;

        System.out.println(num);

        long earthToMoon = 1000; // ----> 10000L
        // create an int variable and try to store abouve long value

        int earthToMoon_int = (int) earthToMoon;
    }

}
