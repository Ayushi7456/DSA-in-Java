package Arrays;

import java.io.*;
import java.util.*;

public class rotate_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        rotate(a, k);
        display(a);
    }

    public static void reverse(int[] a, int i, int j) {
        int li = i;
        int ri = j;
        while (li < ri) {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void rotate(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        // reverse part 1
        reverse(a, 0, a.length - k - 1);

        // reverse part 2
        reverse(a, a.length - k, a.length - 1);

        // all reverse
        reverse(a, 0, a.length - 1);
    }

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
}
