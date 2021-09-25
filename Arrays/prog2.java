package Arrays;

import java.util.*;
import java.util.HashMap;

public class prog2 {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashset.add(arr[i]);
        }
        System.out.print(hashset);
        System.out.print(hashset.size());
    }
}
// Time complexity = O(n);