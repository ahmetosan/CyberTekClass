package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("hey what is the season");
        String season = scan.next();

                /*
                 * What do you do in each season
                 *
                 * Spring -->>> Hike ! Easter , Nawruz, Blossom
                 * Summer -->>> Swim , Vacation , BBQ , Holiday
                 * Fall   -->>> Black Friday , Hiking , Harvest , Halloween , Shopping
                 * Winter --->> Snowboarding , Ski , Chritmas , New Year
                 *
                 * */
                // byte , short , int , char , String
                switch(season){

                    case "Spring" :
                        System.out.println("Hike ! Easter , Nawruz, Blossom");
                        break;
                    case "Summer" :
                        System.out.println("Swim , Vacation , BBQ , Holiday");
                        break;
                    case "Fall" :
                        System.out.println("Black Friday , Hiking , Harvest , Halloween , Shopping");
                        break;
                    case "Winter" :
                        System.out.println("Snowboarding , Ski , Chritmas , New Year");
                        break;
                }
            }
        }
