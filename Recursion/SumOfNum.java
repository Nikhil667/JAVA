package Recursion;

public class SumOfNum {
    public static void main(String[] args) {
        int ans = sum(4);
        System.out.println(ans);
    }
    static int sum(int n){
        if( n == 0 ){
            return 0;
        }
        return n + sum(n-1);
    }
}
