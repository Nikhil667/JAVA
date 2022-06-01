package Recursion;

public class RevNum {
    public static void main(String[] args) {
        revNum(1342);
        System.out.println(sum);
    }
    static int sum = 0;
    static void revNum(int n){
        if( n == 0 ){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        revNum(n/10);
    }
}
