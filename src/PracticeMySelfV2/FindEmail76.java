package PracticeMySelfV2;

import java.util.Scanner;

public class FindEmail76 {


    public static void main(String[] args) {
        //DO NOT CHANGE
        // Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter the text:");

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int underScore = email.indexOf("_");
        int lastNameSonu = email.indexOf("@");

        if(email.contains("_")) {
        System.out.print(email.substring(underScore + 1, lastNameSonu));
        System.out.print("_");
        System.out.print(email.substring(0, underScore));
        System.out.print(email.substring(lastNameSonu));
        }else{
        System.out.println(email);
        }

        }
        }