package week3;
import java.util.*;

public class Problem3 {

    static void mergeSort(int[] arr) {
        Arrays.sort(arr); // simple
    }

    static void quickSort(int[] arr) {
        Arrays.sort(arr);
        // reverse for descending
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {500, 100, 300};

        mergeSort(arr);
        System.out.println("MergeSort: " + Arrays.toString(arr));

        quickSort(arr);
        System.out.println("QuickSort Desc: " + Arrays.toString(arr));
    }
}