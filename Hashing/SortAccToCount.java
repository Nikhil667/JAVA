package Hashing;

import java.util.*;

public class SortAccToCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        Map<Integer, Integer> h = new HashMap<>();
        int[] arr = new int[size];
        for( int i = 0; i < size; i++){
            arr[i]=s.nextInt();
            if(!h.containsKey(arr[i])){
                h.put(arr[i], 1);
            }else{
                h.replace(arr[i], h.get(arr[i])+1);
            }
        }
        Map<String, Integer> h1 = new TreeMap<>();

        for( Map.Entry<Integer, Integer> i : h.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
//            if( h1.containsValue()){
//                h1.replace(, h1.get()+1);
//            }else{
//                h1.put(, 1);
//            }
        }



//        System.out.println(h);

    }
}
