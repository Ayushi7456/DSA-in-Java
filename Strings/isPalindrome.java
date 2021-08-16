import java.util.*;
import java.io.*;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(isPalindrome1(s));
    }

    public static boolean isPalindrome1(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if (!(ch1 >= 'a' && ch1 <= 'z') && !(ch1>='0' && ch1<='9')) {
                i++;
            } else if (!(ch2 >= 'a' && ch2 <= 'z') && !(ch2>='0' && ch2<='9')) {
                j--;
            } else if (ch1 == ch2) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
// input: A man, a plan, a canal: Panama
// output: true
// input: 1a2
// output: false
// input: race a car
// output: false