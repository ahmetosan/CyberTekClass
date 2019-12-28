package PracticeMySelfV2;

public class PrintLettersCombinations91 {




            public static void main(String[] args) {
                String name = "zyxwv";

                for (int x = 0; x <= 4; x++) {
                    for (int i = 0; i <= 4; i++) {

                        String twoChar = name.substring(x,x+1)+name.substring(i,i+1);
                        System.out.println(twoChar);
                    }
                }

            }
}
