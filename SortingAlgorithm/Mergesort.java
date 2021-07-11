public class Mergesort {
    public static void main(String[] args) {
        int[] arr = { 6, 24, 2, 93, 31, 18, 56 };

        int[] sortedArray = merge(arr, 0, arr.length-1);
        display(sortedArray);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] arr, int lo, int hi) {    //recursive function
        if (lo == hi) {
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        int mid = (lo + hi) / 2;
        int[] firsthalf = merge(arr, lo, mid);             // recursive call
        int[] secondhalf = merge(arr, mid + 1, hi);           // recursive call
        int[] sorted = mergeTwoSortedArray(firsthalf, secondhalf);
        return sorted;
    }

    public static int[] mergeTwoSortedArray(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;

        int[] ans = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            } else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            ans[k] = a[i];
            k++;
            i++;
        }

        while (j < b.length) {
            ans[k] = b[j];
            k++;
            j++;
        }

        return ans;
    }
}
