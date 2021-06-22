package challenges;

import java.util.Arrays;

public class ArrayShift {
  public static int[] insertShiftArray(int[] arr, int num){
    //create return array
    int[] result = new int[arr.length+1];
    int middleIndex = (arr.length + 1) /2;

    //copy over existing values
    for (int i = 0; i < arr.length; i++) {
     if (i < middleIndex) { result[i] = arr[i]; }
     else {result[i+1] = arr[i];}
    }

    //add the new value
    result[middleIndex] = num;

    //return the result
    System.out.println(Arrays.toString(result));
    return result;
  }
}
