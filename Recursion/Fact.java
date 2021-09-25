package Recursion;

public class Fact {
    public static void main(String[] args) {
        int n = 5;
        System.out.print("Factorial of " + n + " = " + fact(n));
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
