package Hashing;

import java.util.HashSet;

public class Subset {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,9,7,8,45};
        int[] arr2 = {9,7,478};
        if(check(arr1, arr2)){
            System.out.println("It is");
        }else{
            System.out.println("No");
        }
    }

    static boolean check(int[] arr1, int[] arr2){

        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            if( !h.contains(arr1[i]) ){
                h.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if( !h.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }

}
