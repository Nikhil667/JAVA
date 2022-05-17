package Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int times = 2;
        rotateArray(arr, times); // clockwise direction
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rotateArray( int[] arr, int times ){
        while( times > 0 ){

            int temp = arr[0];

            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;

            times--;
        }
    }
}
