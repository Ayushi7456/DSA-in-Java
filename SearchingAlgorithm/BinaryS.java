public class BinaryS {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 5;
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == n) {
                System.out.println(mid);
                break;
            } else if (arr[mid] < n) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
    }
}
