public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 9, 18, 12 };
        selectionsrt(arr);
        display(arr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionsrt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}