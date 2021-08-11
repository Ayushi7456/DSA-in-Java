import java.io.*;
import java.util.*;

public class BasicStr {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        String s = "CodeNation";
        System.out.println("The length of string  is " + s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.contains("ode")); // checks whether a substring is present or not.
        System.out.println(s.substring(3, 5)); // excess one character less from end index.
        System.out.println(s.substring(4)); // excess all the characters from begining index to last.
        String firstName = "Ayushi ";
        String lastName = "Gupta";
        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));
        // Java uses the + operator for both addition and concatenation.
        // Numbers are added. Strings are concatenated.
        // int x = 10;
        // int y = 20;
        // int z = x + y; // z will be 30 (an integer/number)

        String x = "10";
        String y = "20";
        String z = x + y; // z will be 1020 (a String)

        // If you add a number and a string, the result will be a string concatenation:
        String str = "10";
        int n = 20;
        String r = str + n; // z will be 1020 (a String)

        String sen = "I'm an aspiring web developer.";
        String[] parts = sen.split(" "); // split function
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
        String s1 = "Ayushi";
        String s2 = "Ayushi";
        if (s1 == s2) {             // compares the address of string.
            System.out.println("equal");
        } else {
            System.out.println("unequal");
        }
        if(s1.equals(s2)){          // compares the characters of string.
            System.out.println("equal");
        }else{
            System.out.println("unequal");
        }

        String s3 = new String("Ayushi");
        String s4 = new String("Ayushi");
        // String created using new keyword will always be created outside intern pool and inside heap.
        // Also string is immutable i.e, we can't change or alter it once it is declared.
    }
}
// unlike other data types in Java, Strings are immutable.
// By immutable, we mean that there is no way via which we can change the string
// at the original location in memory.