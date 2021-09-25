package Recursion;

import java.util.*;

public class all_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] iarr = allIndices(arr, x, 0, 0);

        for (int i : iarr) {
            System.out.println(i);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int count) {
        if (idx == arr.length) {
            return new int[count];
        }
        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, x, idx + 1, count + 1);
            iarr[count] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, x, idx + 1, count);
            return iarr;
        }
    }
}
