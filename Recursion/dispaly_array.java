package Recursion;

import java.util.*;

public class dispaly_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        display(arr, 0);
    }

    public static void display(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.println(arr[i]);
        display(arr, i + 1);
    }
}
// time complexity = O(n) since n recursive calls
// space complexity = o(n) since taking n space in stack