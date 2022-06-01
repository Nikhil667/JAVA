package Stack;

import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st =  new Stack<>();
        st.push(1);
        st.push(4);
        st.push(6);
        st.push(9);

        pushBottom(st, 13);
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
    public static void pushBottom(Stack<Integer> st, int d){
        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.peek());
            st.pop();
        }
        st.push(d);
        while(!st2.isEmpty()){
            st.push(st2.peek());
            st2.pop();
        }
    }


}
