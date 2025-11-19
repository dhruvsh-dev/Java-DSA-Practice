public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        selectionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    } 

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = maxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        } 
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
