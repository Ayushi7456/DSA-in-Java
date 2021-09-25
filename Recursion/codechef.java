package Recursion;

import java.util.*;

public class codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int time = 240;
            int p1 = 0;
            int p2 = 0;
            int p3 = 0;
            int total = 0;
            while (time > 0) {
                time -= a;
                System.out.println(time);
                p1 += x;
                System.out.println("p1= " + p1);
                time -= b;
                System.out.println(time);
                p2 += y;
                System.out.println("p2= " + p2);
                time -= c;
                System.out.println(time);
                p3 += z;
                System.out.println("p3= " + p3);
            }
            total = p1 + p2 + p3;
            System.out.println(total);
        // }
    }
}
