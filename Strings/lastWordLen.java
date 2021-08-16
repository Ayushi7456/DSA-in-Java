import java.util.*;
import java.io.*;

public class lastWordLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lastWord(s)); 
    }

    public static int lastWord(String s) {
        int n = s.length();
        if(n==0){
            return 0;
        }
        int length = 0;
        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch == ' '){
                if(length!=0){
                    return length;
                }
                else{
                    length = 0;
                }
            }
            else{
                length++;
            }
        }
        return length;
    }
}
// input: glad to have you         input: d         
// output: 3                       output: 1 