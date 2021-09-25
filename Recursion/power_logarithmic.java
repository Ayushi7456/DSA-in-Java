package Recursion;

import java.util.*;

public class power_logarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x, n);
        System.out.print(ans);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int half = power(x, n / 2);       
        int xn = half * half;
        if (n % 2 != 0) {
            xn = x * xn;
        }
        return xn;
    }
}
