package Stacks;

import java.util.Stack;

public class copyContents {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10); st.push(20); st.push(30); st.push(40); st.push(50);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        while (st.size()>0){
            rt.push(st.pop());
        }
        Stack<Integer> gt =new Stack<>();
        while (rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
