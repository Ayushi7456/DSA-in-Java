package Algorithms;

// Given a sorted array arr(sorted in ascending order), find if there exist any pair of elements having sum equals any fixed number k.
public class two_pointer_technique{
    public static void main(String[] args) {
        int[] arr = { 10, 20, 35, 50, 75, 80 };
        int n = arr.length;
        int k = 70;
        System.out.println(bruteforce(arr, n, k));    // time complexity o(n2)
        System.out.println(optimized(arr, n, k));     // time complexity o(n)
    }

    public static int bruteforce(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    return 1;
                } else if (arr[i] + arr[j] > k) {
                    break;
                }
            }
        }
        return 0;
    }

    public static int optimized(int[] arr, int n, int k) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] == k) {
                return 1;
            } else if (arr[i] + arr[j] > k) {
                j--;
            } else {
                i++;
            }
        }
        return 0;
    }
}
