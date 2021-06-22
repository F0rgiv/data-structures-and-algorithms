import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(reverseArray(arr1)));
        System.out.println(Arrays.toString(reverseArrayInPlace(arr1)));
    }

    public static int[] reverseArray (int[] arr) {
        //create new array
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[result.length-i-1] = arr[i];
        }

        //return result
        return result;
    }

    public static int[] reverseArrayInPlace (int[] arr) {
        //create placeholder for the ellement
        int tmp;
        
        // swap values 
        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }

        return arr;
    }
}