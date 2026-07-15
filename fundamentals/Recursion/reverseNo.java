package Recursion;

import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int result=reverse(n,0);
        System.out.println(result);
    }

    private static int reverse(int n,int r) {
        if(n==0) return r;
        return reverse(n/10,r*10+n%10);
    }
}
