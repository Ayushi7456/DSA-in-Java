// Prog to check whether the input number is prime or not.(optimised soln)
import java.util.*;
public class prog0 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int count = 0;
       for (int i=2; i*i<=n; i++){
            if (n%i==0)
           count++;
           break;
       }
       if (count==0){
           System.out.println("prime");
       }
       else{
           System.out.println("not prime"); 
       }
   }
}
