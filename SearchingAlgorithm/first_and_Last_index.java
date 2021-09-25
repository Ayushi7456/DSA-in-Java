package SearchingAlgorithm;

import java.util.*;

public class first_and_Last_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        System.out.println(firstIndex(arr, n, d));
        System.out.println(lastIndex(arr, n, d));
    }

    public static int firstIndex(int[] arr, int n, int d) {
        int i = 0;                // i is lower index
        int j = n - 1;            // j is higher index
        int result = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (d == arr[mid]) {
                result = mid;
                j = mid - 1;
            } else if (d < arr[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return result;
    }

    public static int lastIndex(int[] arr, int n, int d) {
        int i = 0;
        int j = n - 1;
        int result = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (d == arr[mid]) {
                result = mid;
                i = mid + 1;
            } else if (d < arr[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return result;
    }
}
