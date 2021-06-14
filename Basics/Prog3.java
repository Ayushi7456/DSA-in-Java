// reverse a number.
import java.util.*;

public class Prog3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = scn.nextInt();
        System.out.println("The reverse of te number is");
        System.out.println(reverse(n));
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int dig = n % 10;
            n /= 10;
            rev = rev * 10 + dig;
        }
        return rev;
    }
}
