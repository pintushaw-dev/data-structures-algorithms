package Recursion;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int result =fibo(n);
        System.out.println(result);
    }

    private static int fibo(int n) {
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
}
