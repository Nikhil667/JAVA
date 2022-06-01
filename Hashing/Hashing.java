package Hashing;

import java.util.*;

public class Hashing {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.next ();

        Hashtable<Character, Integer> h = new Hashtable<>();

        for( int i=0; i<str.length(); i++) {

            int count = 0;
            if( h.containsKey( str.charAt(i) ) ){
                h.replace(str.charAt(i),  h.get(str.charAt(i))+1);
            }
            else{
                h.put(str.charAt(i), 1);
            }

        }

        for( Map.Entry<Character, Integer> i : h.entrySet()){
          //  if( i.getValue() == 1){
                System.out.println(i.getKey()+ " "+ i.getValue());
               // break;
            }

        


        
    }
}
