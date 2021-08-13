
import java.io.*;
import java.util.*;

public class compressStr {

  public static String compression1(String str) {
    String ans = str.charAt(0) + "";
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) != str.charAt(i - 1)) {
        ans = ans + str.charAt(i);
      }
    }
    return ans;
  }

  public static String compression2(String str) {
    String ans2 = str.charAt(0) + "";
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(i - 1)) {
        count++;
      } else {
        if (count > 1) {
          ans2 += count;
          count = 1;
        }
        ans2 += str.charAt(i);
      }
    }
    if (count > 1) {
      ans2 += count;
      count = 1;
    }
    return ans2;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }
}
