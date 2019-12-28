package day09;

public class LanguagePicker {
    public static void main(String[] args) {
            int languageOption = 1;
            String dayName = ""; // assigning a empty String value

            String greeting ="";
            int languageCode = 1;
            if (languageOption == 1) {
                greeting = "Salam";
            }else if (languageOption == 2) {
                greeting = "Hello";
            }else if (languageOption == 3) {
                greeting ="privet";
            }else if (languageOption == 4) {
                greeting = "Privet";
            } else if (languageOption == 5){
                greeting = "Merhaba";
            }else if (languageOption == 6) {
                greeting = "hola";
            }else if (languageOption == 7) {
                greeting = "Bonjour";
            }else{
                greeting = "Unknown";
            }
            System.out.println(greeting + ", SDET");
        }


    }
