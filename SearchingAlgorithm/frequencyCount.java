// best binary search algorithm to find the occurance of any number in an array with duplicates. Time complexity is O(log n).
// 1) Use Binary search to get index of the first occurrence of x in arr[]. Let the index of the first occurrence be i. 
// 2) Use Binary search to get index of the last occurrence of x in arr[]. Let the index of the last occurrence be j. 
// 3) Return (j – i + 1);
package SearchingAlgorithm;

import java.util.*;
import java.io.*;

public class frequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6 };
        int n = arr.length;
        int firstIndex = BinarySearch(arr, n, x, true);
        if (firstIndex == -1) {
            System.out.println("count of" + x + "is Zero.");
        } else {
            int lastIndex = BinarySearch(arr, n, x, false);
            System.out.println(lastIndex - firstIndex + 1);
        }
    }

    public static int BinarySearch(int[] arr, int n, int x, boolean searchFirst) {
        int i = 0;
        int j = n - 1;
        int result = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == x) {
                result = mid;
                if (searchFirst) {
                    j = mid - 1; // go on searching towards left (lower indices)
                } else {
                    i = mid + 1; // go on searching towards right (higher indices)
                }
            } else if (arr[mid] > x) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return result;
    }
}
