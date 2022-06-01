package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int el = s.nextInt();
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(linearSearch(arr, el));
    }

    public static int linearSearch(int[] arr, int el){


        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == el){
                return i;
            }
        }
        return -1;
    }

}
