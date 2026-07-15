package Stacks;

import java.util.Stack;

public class pushBottomRecursively {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10); st.push(20); st.push(30); st.push(40); st.push(50);
        int x=2;
        pushAtBottom(st,x);
        System.out.println(st);
    }


    public static void pushAtBottom(Stack<Integer> st,int x) {
        if(st.size()==0) {
            st.push(x);
            return;
        }
        int top=st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }

}
