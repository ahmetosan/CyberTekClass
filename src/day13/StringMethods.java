package day13;

public class StringMethods {
    public static void main(String[] args) {

       /*
       string actions that we already know so far
        */
       //-equals
       String s1 = "hello";
        //-equalsIgnoreCase

        System.out.println( s1.equalsIgnoreCase("HELLO"));

        // toUpperCase method of string is used to make string all character uppercase
        System.out.println(s1);
        System.out.println(s1.toUpperCase());


        // toLowerCase method of string is used to make string all character lowercase
        System.out.println(s1);
        System.out.println(s1.toLowerCase());


        //in order to get how many character we have inside String
        // we can use leght method of String

        System.out.println(s1.length());


        int lengthOfStr = s1.length();

        if (lengthOfStr>4){
            System.out.println("more than 4 char");
        }else{
            System.out.println("not more than 4");
        }
    }
}
