package day23;

public class WarmUpArray {
    //  create an int array of 7 items
    //  assign values
    // 1,  print out in reverse order
    // 2 , store last item in a variable called lastItem
    // print it out separately
    // 3 , print the item right in the middle
    //
    // OPTIONALLY : find sum , find average , find max , find min
    public static void main(String[] args) {

        System.out.println("Hello");

        int[] nums = new int[7];

        nums[0] = 11;
        nums[1] = 2;
        nums[2] = 23;
        nums[3] = 4;
        nums[4] = 53;
        nums[5] = 6;
        nums[6] = 3;


//
//                    int[] num2 = new int[]{11,2,34,4,53,6,3};
//
//
//                    int[] num3 = {11,2,34,4,53,6,3};
//

        for (int x = nums.length - 1; x >= 0; x--) {

            System.out.println("item = " + nums[x]);
        }

        int arraySize  =  nums.length;
        int lastItemIndex = arraySize-1;


        int lastItemValue = nums[lastItemIndex];
        System.out.println("last item value = "+ lastItemValue);

        int middleItemIndex = arraySize/2;
        System.out.println(" middle item value = " + nums[middleItemIndex]);

        int sum = 0;
        for (int x = 0; x < arraySize ; x++) {
            int eachItem = nums[x];
            sum = sum + eachItem; // sum += nums[x];
            System.out.println("sum = " + sum); //  ICINDE YAZILMASI ILE DISINDA YAZILMASI ARASINDAKI FARK

        }    System.out.println("sum = " + sum); //  DISINDA YAZILDIGI ZAMAN BIR KEREDE TOPLAMI VERIRKEN ICINDE YAZILDIGINDA TEKER TKERE EKLEMEYI GORUYORUZ
    }
}