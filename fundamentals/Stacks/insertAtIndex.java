package Stacks;

import java.util.Stack;

public class insertAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10); st.push(20); st.push(30); st.push(40); st.push(50);
        System.out.println(st);
        int idx=3; int x=112;
        Stack<Integer> gt =new Stack<>();
        while (st.size()>idx){
            gt.push(st.pop());
        }
        st.push(x);
        while (gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
