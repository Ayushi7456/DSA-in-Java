package Arrays;

// find the only non-repeating element in an array where every element repeats twice.
public class XOR {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 5, 2, 2, 3, 1 };
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
