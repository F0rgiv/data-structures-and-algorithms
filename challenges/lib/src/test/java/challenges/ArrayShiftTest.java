package challenges;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayShiftTest {
  @Test public void testInsertShiftArray() {
    //ArrayShift classUnderTest = new ArrayShift();
    int[] startArr = {2,4,6,8};
    int[] endArr = {2,4,5,6,8};
    assertArrayEquals(
      "[2,4,6,8], 5 should return [2,4,5,6,8]",
      ArrayShift.insertShiftArray(startArr, 5),
      endArr);

    int[] startArr2 = {4,8,15,23,42};
    int[] endArr2 = {4,8,15,16,23,42};
    assertArrayEquals(
      "[4,8,15,23,42], 16 should return [4,8,15,16,23,42]",
      ArrayShift.insertShiftArray(startArr2, 16),
      endArr2);
  }
}
