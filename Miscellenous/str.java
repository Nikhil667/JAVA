package Miscellenous;

import java.util.Scanner;

public class str {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i) >= 'a' && str.charAt(i) <='z'){
                count++;
            }
            else if(str.charAt(i) >= 'A' && str.charAt(i) <='Z'){
                count++;
            }
            else if (str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
//        public static int countUniqueCharacters(String input) {
//            boolean[] isItThere = new boolean[Character.MAX_VALUE];
//            for (int i = 0; i < input.length(); i++) {
//                isItThere[input.charAt(i)] = true;
//            }
//
//            int count = 0;
//            for (int i = 0; i < isItThere.length; i++) {
//                if (isItThere[i] == true){
//                    count++;
//                }
//            }
//
//            return count;
//        }


    }
}
