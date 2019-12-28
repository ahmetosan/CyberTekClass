package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {
        /*
            int score = 10 ;
            Increment and decrement operator ++  --  has two version
            Pre-increment   ++score
            Post increment  score++
         */

        int apple = 8;

        apple++;


        System.out.println(apple);

        //System.out.println(++apple);
        System.out.println(apple++);
        //System.out.println(apple);

        /* apple++ when ++ comes after the variable it's called post increment,
        it will increase the value
        BUT it will reflect the increased the calue next time variable show up
         */


        int score = 50;
        System.out.println(++score);//51
        System.out.println(score++);//51 and ready to be 52 next time
        System.out.println(score);//52
        System.out.println(--score);//51
        System.out.println(score--);//still 51 and ready to be 50 next time
        System.out.println(score);//50
    }
}
