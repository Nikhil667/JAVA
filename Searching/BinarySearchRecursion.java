package Searching;

import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();
        int size =  s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        // Binary Search works on the assumption that the given array is sorted.
        System.out.println(binarySearchRecursion(arr, k, 0 , size-1));
    }

    public static int binarySearchRecursion( int[] arr, int k, int l, int r){

        if( l > r) return -1;
        int mid = (l + r) / 2;
        if( arr[mid] == k) return mid;
        else if( arr[mid] < k) return binarySearchRecursion(arr, k , mid+1, r );
        else return binarySearchRecursion(arr, k , l, mid-1);
    }
}
