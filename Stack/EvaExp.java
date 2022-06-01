package Stack;

import java.util.*;

public class EvaExp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Stack<Integer> st = new Stack<>();
        for( int i=0; i<n; i++){
            String str = s.next();
            if(isOperator(str)){
                int n2 = st.pop();
                int n1 = st.pop();
                int ans = cal(n1, n2, str);
            }
        }
    }

    public static int cal(int n1, int n2, String str){
        if( str.equals("+")) return n1+n2;
        else if( str.equals("-")) return n1-n2;
        else if( str.equals("*")) return n1*n2;
        else return n1/n2;
    }

    public static boolean isOperator(String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
}
