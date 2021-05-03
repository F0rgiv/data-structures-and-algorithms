package challenges.sorts;

import java.util.Arrays;

public class Sorts {
    public static int[] InsertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
                arr[j + 1] = temp;
            }
        }

        return arr;
    }

    public static int[] MergeSort(int[] arr) {
        int n = arr.length;

        if (n < 2) return arr;
        int mid = n / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);
        // sort the left side
        left = MergeSort(left);
        // sort the right side
        right = MergeSort(right);
        // merge the sorted left and right sides together
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] result = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }

    public static int[] quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            // Partition the array by setting the position of the pivot value
            int position = partition(arr, left, right);
            // Sort the left
            quickSort(arr, left, position - 2);
            // Sort the right
            quickSort(arr, position, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        // set a pivot value as a point of reference
        int pivot = arr[right];
        // create a variable to track the largest index of numbers lower than the defined pivot
        int low = left;
        for (int i = left; i <= right; i++) if (arr[i] <= pivot) swap(arr, i, low++);


        // return the pivot index point
        return low;
    }

    public static void swap(int[] arr, int i, int low) {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}
