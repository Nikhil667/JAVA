package Sorting;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,5};
        int[] arr2 = {3,7,8,9};
        int[] res = merge1(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] merge1(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;

        int [] ans = new int[arr1.length + arr2.length];

        while( i < arr1.length && j < arr2.length){
            if( arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
            }
            else {
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }
        while( i < arr1.length ){
            ans[k] = arr1[i];
            k++;
            i++;
        }
        while( j < arr2.length ){
            ans[k] = arr2[j];
            k++;
            j++;
        }
        return ans;
    }

}
