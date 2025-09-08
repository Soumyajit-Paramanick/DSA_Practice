public class QuickSort {
    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex);
            quickSort(arr, partitionIndex + 1, high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            // Move right until element >= pivot
            do {
                i++;
            } while (arr[i] < pivot);

            // Move left until element <= pivot
            do {
                j--;
            } while (arr[j] > pivot);

            // If pointers cross, return partition index
            if (i >= j) {
                return j;
            }

            // Swap out-of-place elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
