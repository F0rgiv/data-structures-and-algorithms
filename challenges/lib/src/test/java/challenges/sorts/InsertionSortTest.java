package challenges.sorts;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {
    @Test
    public void testInsertionSort() {
        int[] startArr = {8, 4, 23, 42, 16, 15};
        int[] result = {4, 8, 15, 16, 23, 42};
        assertArrayEquals("Confirm the list is sorted", Sorts.InsertionSort(startArr), result);
        int[] startArr1 = {8, 4, 42, 42, -67, 15};
        int[] result1 = {-67,4, 8, 15, 42, 42};
        assertArrayEquals("Confirm the list is sorted", Sorts.InsertionSort(startArr1), result1);
    }
}