package Stacks;

import java.util.Stack;

public class removeAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10); st.push(20); st.push(30); st.push(40); st.push(50); st.push(60);
        int idx=2;
        remove(st,idx);
        System.out.println(st);
    }

    // top based indexing

    public static void remove(Stack<Integer> st, int idx) {
       if(idx==0){
           st.pop();
           return;
       }
       int top=st.pop();
       remove(st,idx-1);
       st.push(top);


    }
}
