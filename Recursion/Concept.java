package Recursion;

public class Concept {
    public static void main(String[] args) {
        func(5);
    }

    static void func(int num){
        if( num == 0 ){
            return;
        }
        System.out.println(num);
        func(--num);// num-- will give error, coz it passes the value of argument first and then increment it
    }
}
