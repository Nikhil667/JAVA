package Hashing;

import java.util.*;

public class search {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,9,7,8,45};
        int k = 45;

        HashSet<Integer> h = new HashSet<>();

        h.add(5);
        h.add(6);
        h.add(8);
        h.add(7);
        h.add(1);
        System.out.println(h);
        h.remove(7);
        System.out.println(h);

        Map<String, Integer> h1 = new TreeMap<>();

        h1.put("Nikhil",2);
        h1.put("Adarsh",4);
        h1.put("LQW",89);
        h1.put("Monica",3);

        System.out.println(h1);

        Map<Integer, Integer> h2 = new LinkedHashMap<>();

        h2.put(1,2);
        h2.put(3,2);
        h2.put(2,2);
        System.out.println(h2);
    }
}
