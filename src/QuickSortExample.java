//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QuickSortExample {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int[] arr = {8, 5, 3, 2, 7, 0, 1, 4, 6, 9};
        System.out.println("Original Array");
        printArrayElem(arr);
        performQuickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array");
        printArrayElem(arr);
    }

    private static void printArrayElem(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    private static void performQuickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partition(arr, lowIndex, highIndex);
            System.out.println("partIndex is = " + partitionIndex);
            performQuickSort(arr, lowIndex, partitionIndex - 1);
            performQuickSort(arr, partitionIndex + 1, highIndex);
        }
    }

    private static int partition(int[] arr, int lowIndex, int highIndex) {
        int pivot = arr[highIndex];       // pivot is the last element
        int i = lowIndex - 1;             // tracks the boundary of elements smaller than pivot

        for (int j = lowIndex; j < highIndex; j++) {
            if (arr[j] <= pivot) {   // if current element <= pivot, it should be left side
                i++;                 // move boundary forward
                swap(arr, i, j);     // swap current element to boundary
            }
        }
        swap(arr, i + 1, highIndex);      // place pivot next to last smaller element
        return i + 1;                // return pivot's final position
    }

    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}