package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        quickSort(arr, 0 , size-1);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int l, int r){

        if( l >= r ) return;
        int pi = pivotIndex(arr, l, r);
        quickSort(arr, l, pi-1);
        quickSort(arr, pi+1, r);

    }

    public static int pivotIndex(int[] arr, int l, int r){

        int pivot = arr[r];
        int i= l, j = l;

        while( i <= r ){
            if( arr[i] <= pivot){
                if ( i != j){
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

