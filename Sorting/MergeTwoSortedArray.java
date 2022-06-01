package Sorting;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = s.nextInt();
        }

        int[] res = merge( arr, arr2);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

    public static int[] merge(int[] arr, int[] arr2){

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
