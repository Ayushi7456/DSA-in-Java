
// Write a function that prints the Nth fibonacci.
import java.util.*;

public class Prog4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i <= n; i++) {
            if (i == n) {
                System.out.print(a);
            }
                c = a + b;
                a = b;
                b = c;
        }
    }
}
