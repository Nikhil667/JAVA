package String;

import java.util.*;

public class CountCharByHashing {
    public static void main(String[] args) {
        String str = "AADDDBBC";
        Map<Character, Integer> h = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!h.containsKey(str.charAt(i))) {
                h.put(str.charAt(i), 1);
            } else {
                h.replace(str.charAt(i), h.get(str.charAt(i)) + 1);
            }
            //h.clear();
        }
        for (Map.Entry<Character, Integer> i : h.entrySet()){
            System.out.print(i.getKey()+""+i.getValue());
        }
    }
}

//Without Hashing
//public static String compress(String T) {
//		String t = T.charAt(0) + "";
//		int count = 1;
//
//		for(int i=1;i<T.length(); i++) {
//			char curr = T.charAt(i);
//			char prev = T.charAt(i-1);
//			  if(curr == prev) {
//				  count++;
//			  }
//			  else {
//				  if(count>=1) {
//					  t += count;
//					  count = 1;
//				    }
//					t += curr;
//			  }
//		}
//		if(count>=1) {
//			t +=count;
//			count = 1;
//		}
//		 return t;
//	}