package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        insertonSort(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void insertonSort(int[] arr){
        int count = 0;
        int size = arr.length;
        for( int i =1; i<size; i++){
            for( int j=i; j>0; j--){
                if( arr[j-1] > arr[j] ){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    count++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(count);


    }


}


