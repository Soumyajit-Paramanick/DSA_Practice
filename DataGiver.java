import java.util.*;

public class DataGiver {
    public static void main(String[] args) {
        System.out.println("Enter the number of elemants you want to push in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + "elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element no." + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements in the array before sorting are : ");
        PrintArray.printArray(arr);
        System.out.println("""
                Enter a number which type of sorting you want to do?
                1. Bubble Sort
                2. Selection Sort
                3. Insertion sort
                4. Marge Sort
                5. Quick Sort
                """);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                BubbleSort.bubbleSort(arr);
                System.out.println("The elements in the array after Bubble sort are :");
                PrintArray.printArray(arr);
                break;
            case 2:
                SelectionSort.selectionSort(arr);
                System.out.println("The elements in the array after Selection sort are :");
                PrintArray.printArray(arr);
                break;
            case 3:
                InsertionSort.insertionSort(arr);
                System.out.println("The elements in the array after Insertion sort are :");
                PrintArray.printArray(arr);
                break;
            case 4:
                MergeSort.mergeSort(arr, 0, arr.length - 1);
                System.out.println("The elements in the array after Merge sort are :");
                PrintArray.printArray(arr);
                break;
            case 5:
                QuickSort.quickSort(arr, 0, arr.length - 1);
                System.out.println("The elements in the array after Quick sort are :");
                PrintArray.printArray(arr);
                break;
        }
    }
}
