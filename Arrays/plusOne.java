import java.util.*;
import java.io.*;

public class plusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++){
            digits[i] = sc.nextInt();
            System.out.println(plusOne(digits));
        }
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] ans = new int[n + 1];
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
}
