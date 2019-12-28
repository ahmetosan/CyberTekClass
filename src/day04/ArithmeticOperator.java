package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {


        System.out.println(5+5);
        System.out.println(5-3);
        System.out.println(5*3);
        System.out.println(5/3);

        // aritmetic operator between two int -->> another int

        System.out.println(5+3.0d);
        System.out.println(5-3.0d);
        System.out.println(5*3.0d);
        System.out.println(5/3.0d);

        //arithmetic  operator between twp numerical data type
        //the final result will be larger data type


        int a = 5;
        double b = 3.0d;
        float c = 3.0f;

        /// way 1
        double result1 = a + b ;
        double result2 = a - b ;
        double result3 = a * b ;
        double result4 = a / b ;
        double result5 = a / c ;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        ///way 2

        System.out.println(a+a);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        System.out.println(a+c);
        System.out.println(a-c);
        System.out.println(a*c);
        System.out.println(a/c);



    }
}
