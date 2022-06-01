package Miscellenous;

import java.util.Arrays;

public class AlternativeSorting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 8, 5, 16};

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length-1;

        while( i < j ){
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }

        if( arr.length % 2 != 0 ){
            System.out.print(arr[i] + " ");
        }
    }
}
