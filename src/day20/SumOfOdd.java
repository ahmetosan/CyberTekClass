package day20;

public class SumOfOdd {
    public static void main(String[] args) {

        int sum = 0;

        for(int x = 10 ; x<=100 ; x++){

            if(x%2 == 1) {
                //System.out.println(x);
                sum += x; // sum = sum + x

            }
        }

        System.out.println("sum = "+ sum);

    }
}
