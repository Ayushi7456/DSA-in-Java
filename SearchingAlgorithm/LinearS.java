// program to find given element in array.
import java.util.*;

public class LinearS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search in array.");
        int n = sc.nextInt();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int result = linear(arr, n);
        if (result == -1) {
            System.out.println("The element doesn't exists in array. ");
        } else {
            System.out.println("The element exists in array at index " + result);
        }
    }
    public static int linear(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
