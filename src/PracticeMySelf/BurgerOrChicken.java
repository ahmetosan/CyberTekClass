package PracticeMySelf;

import java.util.Scanner;

class BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


            String food = s.nextLine();
            float chickBurger = 10;
            float soda = 2;
            if(food.contentEquals("burger") || food.contentEquals("chicken"))
            { System.out.println(chickBurger);
            }else if (food.contentEquals("soda")){
            System.out.println(soda);
            }
            }

            }
