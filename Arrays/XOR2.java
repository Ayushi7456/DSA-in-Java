package Arrays;

// Find the two non-repeating elements in an array where every elements in an array repeats twice.
public class XOR2 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 4, 3, 5, 1, 2 };
        int n = arr.length;
        uniqueNumbers(arr, n);
    }

    public static void uniqueNumbers(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum ^ arr[i]);
        }
        sum = (sum & -sum);           // -sum is 2's compliment of sum
        // Bitwise & will give us the sum containing only the rightmost set bit.
        int num1 = 0;
        int num2 = 0;                // num1 and num2 are 2 unique elements.
        for (int i = 0; i < n; i++) {
            if ((arr[i] & sum) > 0) {
                num1 = (num1 ^ arr[i]);
            } else {
                num2 = (num2 ^ arr[i]);
            }
        }
        System.out.println(num1 + num2);
    }
}
