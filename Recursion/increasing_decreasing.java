package Recursion;

import java.util.*;

public class increasing_decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        increasingDecreasing(n);
    }

    public static void increasingDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        increasingDecreasing(n - 1);
        System.out.println(n);
    }
}
