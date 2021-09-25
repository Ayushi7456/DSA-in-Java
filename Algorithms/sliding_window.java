package Algorithms;

// Given an array of integers and a number k. Return the maximum sum of a subarray of a size k.
public class sliding_window {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        int k = 3;
        System.out.println(bruteforce(arr, n, k)); // time complexity o(n2)
        System.out.println(optimized(arr, n, k)); // time complexity o(n)
    }

    public static int bruteforce(int[] arr, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;
            for (int j = i; j < i + k; j++) {
                current_sum += arr[j];
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }

    public static int optimized(int[] arr, int n, int k) {
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum += arr[i];
        }
        int window_sum = max_sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(window_sum, max_sum);
        }
        return max_sum;
    }
}
