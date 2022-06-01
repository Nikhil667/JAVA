package Miscellenous;

public class Pal {
        public static void main(String[] args) {
            System.out.println(reverse(345));

        }
        public static boolean reverse (int n){
            int res=0;
            int temp = n;
            while(temp>0){
                int last =temp%10;
                res=res*10+last;
                temp=temp/10;
            }
            if( temp == n) {
                return true;
            }
            return false;

        }
    }

