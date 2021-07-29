public class Quicksort {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1 };

        quicksort(arr, 0, arr.length - 1);
        display(arr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quicksort(int[] arr, int lo, int hi) {
        if (lo > hi) {
            return;
        }
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);    // pi is pivot index
        quicksort(arr, lo, pi - 1);
        quicksort(arr, pi + 1, hi);

    }

    public static int partition(int[] arr, int pivot, int lo, int hi) {
        int i = lo;
        int j = lo;
        while (i < arr.length) {
            if (arr[i] > pivot) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        return j - 1;   // pivot index
    }
}
// Time complexity of Quicksort is O(nlogn).
