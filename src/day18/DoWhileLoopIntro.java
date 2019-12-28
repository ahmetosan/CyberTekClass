package day18;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        // count from 1 to 5;

        int x = 1;


        do {
            System.out.println(x);
            x++;
        } while (x<5);


        System.out.println("------------------------------------");
        // count 5 to 1

        int y = 5;

        do {
            System.out.println(y);
            --y;
        }while (y>0);

    }
}
