package Sorting;

public class PivotIndex {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 8, 9};
        int sElement = 3;
        int p = pivotIndex(arr, sElement );
        System.out.println(p);
    }
    public static int pivotIndex( int[] arr, int sElement){
        int i = 0;
        int j = 0;
        int pivot = sElement;

        while( i <= arr.length-1){
            if( arr[i] <= pivot ){
                if( i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            i++;
        }
        return j-1;
    }
}
