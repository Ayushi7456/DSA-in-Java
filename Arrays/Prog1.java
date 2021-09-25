package Arrays;

import java.util.*;
import java.util.HashMap;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            hashmap.put(arr[i], i);
        }
        System.out.println(hashmap.keySet()); 
    }
}
