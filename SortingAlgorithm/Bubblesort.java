public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = { 55, 2, 9, 17, 34, 26 };
        System.out.println("original array is ");
        display(arr);
        System.out.println();
        System.out.print("Sorted array is ");
        Bubblesrt(arr);
        display(arr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Bubblesrt(int[] arr) {
        for (int counter = 0; counter < arr.length - 1; counter++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

