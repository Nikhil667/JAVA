package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        selectionSort(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr){
        int count = 0;
        int size = arr.length;
        int minIdx = Integer.MIN_VALUE;
        for (int i = 0; i < size-1; i++) {
            minIdx = i;
            for (int j = i+1; j < size; j++) {
                //count++;
                if( arr[minIdx] > arr[j] ){
                    minIdx = j;
                    count++;
                }
                if ( i != minIdx){
                    int temp = arr[i];
                    arr[i] = arr[minIdx];
                    arr[minIdx] = temp;
                    //count++;
                }
            }
        }
        System.out.println(count);

    }


}
