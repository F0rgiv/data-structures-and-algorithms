package challenges;

public class BinarySearch {
  public static int binarySearch(int[] arr, int target){
    //if empty return -1
    if (arr.length == 0) return -1;

    //declare high low mid
    int high = arr.length -1;
    int low = 0;
    int mid = (high+low)/2;

    //start search
    while (high != low + 1){
      //return if found
      if (arr[mid] == target) return mid;
      //change mid if needed
      if (arr[mid] > target) high = mid;
      if (arr[mid] < target) low = mid;
      //recalculate mid
      mid = (high+low)/2;
    }

    //check the remaining to ensure that target isn't there
    if (arr[low] == target) return low;
    if (arr[high] == target) return high;

    //if not found return
    return -1;
  }
}
