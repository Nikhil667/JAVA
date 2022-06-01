package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        bubbleSort(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void bubbleSort(int[] arr) {
        int count = 0;
        //boolean swapped = false;
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                count++;
                if( arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    //swapped = true;
                }

            }
            //if (swapped == false)
                // ā+++++++++break;

        }
        System.out.println(count);

    }
}
