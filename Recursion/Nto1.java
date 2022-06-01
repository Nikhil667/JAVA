package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        funcRev(5);
    }

    static void func(int num){
        if( num == 0 ){
            return;
        }
        System.out.println(num);
        func(num -1);
    }
    static void funcRev(int num){
        if( num == 0 ){
            return;
        }
        funcRev(num -1);
        System.out.println(num);
    }
}
