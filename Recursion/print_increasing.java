package Recursion;

import java.util.*;

public class print_increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pd(n);
    }

    public static void pd(int n) {
        if (n == 0) {
            return;
        }
        pd(n - 1);
        System.out.println(n);
    }
}
