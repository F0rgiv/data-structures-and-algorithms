package challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
  @Test
  public void testBinarySearch() {
    int[] arr1 = {4,8,15,16,23,42};
    int[] arr2 = {11,22,33,44,55,66,77};
    int[] arr3 = {1, 2, 3, 5, 6, 7};

    assertEquals("index of 15 is 2", 2, BinarySearch.binarySearch(arr1, 15));
    assertEquals("19 is not in the Array", -1, BinarySearch.binarySearch(arr2, 90));
    assertEquals("4 is not in the Array", -1, BinarySearch.binarySearch(arr3, 4));
    assertEquals("index of 1 is 0", 0, BinarySearch.binarySearch(arr3, 1));
    assertEquals("index of 7 is 6", 5, BinarySearch.binarySearch(arr3, 7));
  }
  @Test
  public void testBinarySearchEmpty() {
    int[] arr4 = {};
    assertEquals("should return -1", -1, BinarySearch.binarySearch(arr4, 7));
  }
}
