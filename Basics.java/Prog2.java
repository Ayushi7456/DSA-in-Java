// Given lower limit and upper limit, write a function to print all primes within that range.
import java.util.*;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit.");
        int n1 = sc.nextInt();
        System.out.println("Enter the upper limit.");
        int n2 = sc.nextInt();
        System.out.println("All the prime numbers betwwen the given range are: ");
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            for (int j = 2; j * j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
