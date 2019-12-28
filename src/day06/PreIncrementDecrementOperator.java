package day06;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {

        int offerCount = 2;

        //v incrising the numbe rby one using normal way
        // offerCount = offerCount + 1;

        //v this is increasinf the value by one using compound /shorthand operator
        // offerCount +=1;

        //v since increasing or decreasing a value is very special
        // and often used in programing
        // there is even shorter way for this operation
        // and we use ++ or -- , THIS IS EXCLUSIVELY FOR INCREASING OR DECREASING BY  1
        // WE CAN NOT USE IT  FOR ANY OTHER TIME LIKE INCRESING VALUE DECREASING VALUE BY MORE THAN ONE.


        ++ offerCount;
        System.out.println("Offer now " + offerCount);

        -- offerCount;
        System.out.println("Offer now " + offerCount);

    }
}
