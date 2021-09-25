package ArrayLists;

import java.util.*;

public class booleanArraylist {
    public static void main(String[] args) {
    int [] candies = new int[5];
    int extraCandies = 3;
     System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);   
            //if the condition will be true it will add true to the arraylist else add false.
        }
        return result;
    }
}
