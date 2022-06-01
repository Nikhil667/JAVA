package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int el = s.nextInt();
        int size =  s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        // Binary Search works on the assumption that the given array is sorted.
        System.out.println(binarySearch(arr, el));
    }

    public static int binarySearch(int[] arr, int el){

        int l = 0;
        int r = arr.length-1;

        while( l <= r ){

            int mid = l + r / 2;

            if( arr[mid] == el ) return mid;

            else if( arr[mid] < el ) l = mid+1;

            else r = mid-1;
        }

        return -1;
    }
}
