package Recursion;

import java.util.*;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0);
    }

    public static void reverse(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.println(arr[arr.length-1-i]);
        reverse(arr, i+1);
        // or
        // reverse(arr, i+1);
        // System.out.println(arr[i]);
    }
}
// time complexity = O(n) since n recursive calls
// space complexity = o(n) since taking n space in stack