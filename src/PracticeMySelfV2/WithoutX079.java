package PracticeMySelfV2;

import java.util.Scanner;

public class WithoutX079 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender= "";
        String phoneNumber="";
        String messageBody="";




        int name = sender.indexOf("<");
        int nameEnd = sender.indexOf(">");
        int number = phoneNumber.indexOf("[");
        int numberEnd = phoneNumber.indexOf("]");
        int mssg = messageBody.indexOf("{");
        int mssgEnd = messageBody.indexOf("}");

        System.out.println("Sender: "+ sender.substring(name+1,nameEnd));
        System.out.println("Phone Number: "+ phoneNumber.substring(number+1,numberEnd));
        System.out.println("Message body: "+ messageBody.substring(mssg+1,mssgEnd));

    }
}