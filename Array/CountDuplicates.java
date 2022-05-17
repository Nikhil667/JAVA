package Array;

import java.util.*;


public class CountDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] arr = new int[size];
        for( int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for( int i = 0; i < size; i++){

            if( h.containsKey(arr[i]) ){
                int x = h.get(arr[i]);
                h.replace(arr[i], x+1);
            }
            else{
                h.put(arr[i], 1);
            }
        }

//        for (int i = 0; i < h.size(); i++) {
//            if( getValue(i) > 1 ){
//                System.out.println(i.getKey() + " " + i.getValue());
//            }
//        }

        for(Map.Entry<Integer, Integer> i : h.entrySet()){
            if( i.getValue() > 1 ){
                System.out.println(i.getKey() + " " + i.getValue());
            }
        }


    }


}
