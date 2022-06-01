package Hashing;

import java.util.*;

public class EVM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Map<String, String> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s1 = s.next();
            String s2 = s.next();
            if( !h.containsKey(s1)){
                h.put(s1, s2);
            }
        }
        Map<String, Integer> h1 = new TreeMap<>();
        int max = 1;
        for( Map.Entry<String, String> i : h.entrySet()){
            String val = i.getValue();
            if( h1.containsKey(val)){
                h1.replace(val, h1.get(val)+1);
                if( max < h1.get(val) ){
                    max = h1.get(val);
                }
            }else{
                h1.put(val, 1);
            }
        }

        for( Map.Entry<String, Integer> j : h1.entrySet() ) {
            if ( j.getValue() == max ){
                System.out.println(j.getKey() + " " + j.getValue());
            }
        }
    }
}

//System.out.println(max);
//        System.out.println(h);
//        System.out.println(h1);