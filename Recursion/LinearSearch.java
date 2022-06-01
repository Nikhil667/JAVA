package Recursion;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,4,55,4,78};
        int target = 4;

//        System.out.println(search(arr, target, 0));
//
//        System.out.println(searchFromLast(arr, target, arr.length - 1));
//
//        findAllIndex(arr, target, 0);
//        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr, target, 0, list);
//        System.out.println(ans);

        System.out.println(findAllIndex2(arr, target, 0));

    }

    static int search(int[] arr, int target, int index){
        if( index == arr.length){
            return -1;
        }

        if( arr[index] == target ){
            return index;
        }
        return search(arr, target, index+1);
    }

    static int searchFromLast(int[] arr, int target, int index){
        if( index == -1){
            return -1;
        }

        if( arr[index] == target ){
            return index;
        }
        return searchFromLast(arr, target, index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if( index == arr.length){
            return;
        }
        if( arr[index] == target ){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if( index == arr.length){
            return list;
        }
        if( arr[index] == target ){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if( index == arr.length){
            return list;
        }

        if( arr[index] == target ){
            list.add(index);
        }
        ArrayList<Integer> listFromBelowCalls =  findAllIndex2(arr, target, index+1);

        list.addAll(listFromBelowCalls);

        return list;
    }






}
