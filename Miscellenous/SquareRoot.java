package Miscellenous;

public class SquareRoot {
    public static void main(String[] args) {

        int count = 0;
        int a = 25;
        while(a>0){
            int mid = a/2;
            count++;
            if( mid == 1 || mid == 0){
                break;
            }
            a=mid;
        }
        System.out.println(count);
    }
}
