package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= s.nextInt();
        }

        int[] res = mergeSort(arr, 0, size-1);

        for (int i = 0; i < size; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] mergeSort(int[] arr, int l, int r){

        if (l == r){
            int[] result = new int[1];
            result[0] = arr[l];
            return result;
        }
        int mid = (l + r ) / 2;
        int[] larr = mergeSort(arr, l, mid);
        int[] rarr = mergeSort(arr, mid+1, r);
        return merge(larr, rarr);

    }

    public static  int[] merge(int[] arr, int[] arr2){

        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[arr.length + arr2.length];

        while( i<arr.length && j<arr2.length){
            if( arr[i] < arr2[j]){
                ans[k] = arr[i];
                i++;
                k++;
            }
            else{
                ans[k] = arr2[j];
                j++;
                k++;
            }

        }
        while( i< arr.length){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while( j< arr2.length){
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
