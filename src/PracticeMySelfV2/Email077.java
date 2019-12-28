package PracticeMySelfV2;

import java.util.Scanner;

public class Email077 {


    public static void main(String[] args) {
        //DO NOT CHANGE
        //Scanner scan = new Scanner(System.in);
        //String email = scan.next();
        String email = "craig_federighi@apple.com";

        int underScore = email.indexOf("_");
        int lastNameSonu = email.indexOf("@");
        int domain = email.indexOf(".");

                    System.out.println("First name: "+ (email.substring(0, 1)).toUpperCase()+(email.substring(1, underScore)));
                    System.out.println("Last name: " + (email.substring(underScore+1,underScore + 2).toUpperCase()+email.substring(underScore+2, lastNameSonu)));
                    System.out.println("Domain :" + email.substring(lastNameSonu+1,domain));
                    System.out.println("Top-Level Domain: "+ email.substring(domain+1));


                    // System.out.println(email.charAt(0));

                    }
                    }