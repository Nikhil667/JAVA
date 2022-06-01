package Searching;

import java.util.Scanner;

public class TernarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();
        int size =  s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(ternarySearch(arr, k));
    }

    public static int ternarySearch( int[] arr , int k){
        int l = 0;
        int r = arr.length-1;
        while( l <= r){

            int mid = (r-l)/3;
            int m1 = mid + l;
            int m2=  r - mid;

            if( arr[m1] == k) return m1;

            else if ( arr[m2] == k) return m2;

            else if ( arr[m1] > k) r = m1 - 1;

            else if ( arr[m2] < k) l = m2 + 1;

            else{
                l = m1 + 1;
                r = m2 - 1;
            }

        }

        return -1;
    }
}
