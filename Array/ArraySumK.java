package Array;

import java.util.HashSet;

public class ArraySumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3};
        int sum = 5;
//        int remSum = 0;
//        int[] newarr = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            int temp = sum - arr[i];
//
//            if (containsElement(newarr, temp) == true) {
//                System.out.println(arr[i] + " " + temp);
//            }
//            newarr[i] = arr[i];
//        }
//    }
//
//    public static boolean containsElement(int[] arr, int temp){
//        for (int i = 0; i < arr.length; i++) {
//            if( temp == arr[i] ){
//                return true;
//            }
//        }return false;
//    }


        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
            System.out.println(s);
        }
    }
}

