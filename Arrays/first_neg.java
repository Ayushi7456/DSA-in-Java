package Arrays;

import java.util.*;

// first negative number in every window of size k
public class first_neg {
    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int n = arr.length;
        int k = 3;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(firstNegative(arr, n, k, list));
    }

    public static ArrayList<Integer> firstNegative(int[] arr, int n, int k, ArrayList<Integer> list) {
        for (int i = 0; i < n - k + 1; i++) {
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    list.add(arr[j]);
                }
            }
        }
        return list;
    }
}
