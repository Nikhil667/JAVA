package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fib(5);
        System.out.println(ans);
    }

    public static int fib( int n ){
        if( n < 2 ){
            return 1;
        }
        return fib( n-1 ) + fib( n-2 );
    }
}
