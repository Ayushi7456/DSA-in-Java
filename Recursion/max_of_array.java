package Recursion;

import java.util.*;

public class max_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr, 0));
    }

    public static int maxOfArray(int[] arr, int idx) {
        if (idx >= arr.length) {
            return 0;
        }
        int max = arr[idx];
        int current_element = maxOfArray(arr, idx + 1);
        if (current_element > max) {
            max = current_element;
            // remember that comparison is being done from the last element of array as
            // upper lines of recursion exutes while calling till base case and then lower
            // lines of recusion call excutes while coming down.
        }
        return max;
    }
}
// Time complexity = o(n)
// space complexity = O(n)