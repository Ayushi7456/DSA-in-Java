public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 23, 35, 44, 59, 78, 2, 18 };
        System.out.println("Original array is: ");
        display(arr);
        insertionsrt(arr);
        System.out.println("Sorted array is: ");
        display(arr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionsrt(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}