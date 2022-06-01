package Recursion;

public class RevNum2 {
    public static void main(String[] args) {
        int ans = revNum(14562);
        System.out.println(ans);
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
}
