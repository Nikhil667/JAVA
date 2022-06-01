package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(14541));
    }

    static int revNum(int n){
         int digits = (int)Math.log10(n) + 1;
         return helper(n, digits);
    }

    static int helper(int n, int digits){
        if( n%10 == 0 ){
           return 0;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
    static boolean palindrome(int n){
        if( n == revNum(n)){
            return true;
        }
        return false;
    }
}
