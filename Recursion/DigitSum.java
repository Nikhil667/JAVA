package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        int ans = sumDig(1345);
        System.out.println(ans);
    }
    static int sumDig(int n){
        if( n == 0 ){
            return 0;
        }
        return n%10 + sumDig(n/10);
    }
}
