package day06;

public class CompoundOperator3Remainder {
    public static void main(String[] args) {
      int bankBalance = 1140;

        System.out.println("I have spent the of it: " +bankBalance);
        //bankBalance /= bankBalance/2;
        bankBalance /=2;
        System.out.println("Now my balance is " + bankBalance);

        // I want to devide the balance by 500 and keep the remainder in my pocket
        //bankBalance = bankBalance%500;
        bankBalance %= 500;
        System.out.println("The remainder is "+ bankBalance);
    }


}


