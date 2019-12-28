package day06;

public class TimeConvert {
    public static void main(String[] args) {
        int minutes = 135;
        int hourPart= 135/60;
        int minutesPart=135%60;

        System.out.println("The minutes is "+minutes+" is "+ hourPart+" hours and " + minutesPart + " minutes");
    }
}
