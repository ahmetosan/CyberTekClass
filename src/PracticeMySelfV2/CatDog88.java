package PracticeMySelfV2;

import java.util.Scanner;

public class CatDog88 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        // code starts here

        int iCat = word.indexOf("cat");
        int iDog = word.indexOf("dog");

        while (iCat != -1) {
            ++countOfCats;
            iCat = word.indexOf("cat", iCat+1);
        }

        while (iDog != -1) {
            ++countOfDogs;
            iDog = word.indexOf("dog", iDog+1);
        }

        System.out.println(countOfCats==countOfDogs);
    }
}