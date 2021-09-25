package Recursion;

import java.util.*;

public class print_decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pd(n);
    }

    public static void pd(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        pd(n - 1);
    }
}
