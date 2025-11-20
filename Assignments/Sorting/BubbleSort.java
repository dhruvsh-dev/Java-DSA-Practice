public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        bubble(arr);
 
        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void bubble(int[] arr) {
        // Run the steps N-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; // Optimization to stop early
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // if no swaps occurred, the array is already sorted
            if (!swapped) break;
        }
    }
}
