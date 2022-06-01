package Miscellenous;

import java.util.*;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr1 = {7, 4, 8, 0, 1};
        int[] arr2 = {9, 7, 2, 3, 6};
        //System.out.println(maximizeArray(arr1, arr2, 4));
        maximizeArray(arr1, arr2, 5);
    }
    public static void maximizeArray(int[] arr1, int[] arr2, int n) {
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if( arr2[i] < min ){
                min = arr2[i];
            }
            h.add(arr2[i]);
        }
        int nextMin = 0;
        for (int i = 0; i < arr1.length; i++) {
            if( !h.contains(arr1[i]) ){
                if( arr1[i] >= min ){
                    h.add(arr1[i]);
                    h.remove(min);
                    min = arr1[i];
                }
            }
        }

        System.out.println(h);
        System.out.println(min);

        //return list;
    }

}
