package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {

        char grade = 'B';
        System.out.println(grade);

        int letterInNumber = 'B';
        System.out.println(letterInNumber);
        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);


        //-------------------------->>>>

        char myFirstChar = 100;
        System.out.println(myFirstChar);

        char myFirstChar2 = (char) 100;
        System.out.println(myFirstChar2);

        //------------------------->>>>>
        // adding a character to a int number will result in int
        //(int) letterA + 1
        char latterA = 'a';
        System.out.println(latterA + 1);
        System.out.println("" + latterA + 1);

    }
}
