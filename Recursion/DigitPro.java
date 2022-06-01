package Recursion;

public class DigitPro {
    public static void main(String[] args) {
        int ans = proDig(13045);
        System.out.println(ans);
    }
    static int proDig(int n){
        if( n == 0 ){
            return 1;
        }
        return n%10 * proDig(n/10);
    }
}
