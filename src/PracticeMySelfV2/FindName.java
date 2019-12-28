package PracticeMySelfV2;

import java.util.Scanner;

public class FindName {


    public static void main(String[] args) {
        //DO NOT CHANGE
       // Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter the text:");

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if(a.contains("alejandro")){
            System.out.println("read this mail");

        }else{
            System.out.println("dont read");
        }


    }
}

