import java.util.Scanner;

public class Prog1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int value = 1;
        int st = n - 1;
        for (int j = 1; j <= n; j++) {
            value = 1;
            for (int i = 1; i <= n; i++) {
                if (i <= j) {
                    // here i took j=column, i=row.
                    System.out.print(value + "  ");
                    value++;
                } else {
                    System.out.print("*  ");
                    st--;
                }
            }
            System.out.println();
        }
    }
}