package challenges.sorts;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortsTest {

    @Test
    public void insertionSort() {
        int[] startArr0 = {8,4};
        int[] expected0 = {4,8};
        assertArrayEquals("Confirm the list is sorted", expected0, Sorts.MergeSort(startArr0));
        int[] startArr1 = {8, 4, 42, 42, -67, 15};
        int[] expected1 = {-67,4, 8, 15, 42, 42};
        assertArrayEquals("Confirm the list is sorted", expected1, Sorts.MergeSort(startArr1));
        int[] startArr2 = {8, 4, 23, 42, 16, 15};
        int[] expected2 = {4, 8, 15, 16, 23, 42};
        assertArrayEquals("Confirm the list is sorted", expected2, Sorts.MergeSort(startArr2));
    }

    @Test
    public void mergeSort() {
        int[] startArr1 = {1, 3, 4};
        int[] startArr2 = {2, 7, 8};
        int[] expected = {1, 2, 3, 4, 7, 8};
        assertArrayEquals("Confirm the is merged", expected, Sorts.merge(startArr1, startArr2));
        int[] startArr3 = {1, 2, 3, 4};
        int[] startArr4 = {2};
        int[] expected2 = {1, 2, 2, 3, 4};
        assertArrayEquals("Confirm the is merged", expected2, Sorts.merge(startArr3, startArr4));
    }
}