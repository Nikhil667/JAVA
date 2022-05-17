package Array;

public class Neg {
    public static void main(String[] args) {
        int[] arr = {-3,-2,1,0};
        int t = getNegativeNumbersCount(arr);
        System.out.println(t);
    }
    public static int binarySearch (int[] arr, int low, int high) {
        if (high > low) {
            int mid = (high + low) / 2;
            if (arr[mid] < 0 && arr[mid + 1] >= 0) {
                return mid;
            } else if (arr[mid] >= 0 && arr[mid + 1] >= 0) {
                return binarySearch(arr, 0, mid);
            } else {
                return binarySearch(arr, mid + 1, high);
            }
        }//10.55 pe bolio isse
        return -1;
    }
    public static int getNegativeNumbersCount (int[] arr) {
        if(arr[0] >= 0) {
            return 0;
        }
        if(arr[arr.length-1] < 0) {
            return arr.length;
        }
        return binarySearch(arr, 0, arr.length) + 1; // index + 1
    }

}
