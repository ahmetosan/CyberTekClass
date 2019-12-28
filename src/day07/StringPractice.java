package day07;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    String firstName, lastName, company, email;
        firstName = scan.next();//"ahmet";
        lastName = scan.next();//"enver";
        company = scan.next();//"verizon";

        email = firstName+"_"+lastName+"@"+company+".com";

        System.out.println("My name is "+firstName+" "+lastName+" and I work for "+company+" "+"and my email is"+email);


        System.out.println();
    }
}
