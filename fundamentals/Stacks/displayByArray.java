package Stacks;

import java.util.Stack;

public class displayByArray {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10); st.push(20); st.push(30); st.push(40); st.push(50);
        int n=st.size();
        int arr[]=new int [n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            st.push(arr[i]);
        }
    }
}
