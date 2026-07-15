package Recursion;
import java.util.Scanner;
public class GcdTWoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result=gcd(a,b);
        System.out.println(result);

    }
    public static int gcd ( int a, int b){
//        for (int i = Math.min(a, b); i >= 1; i--) {
//            if (a % i == 0&& b %i == 0) {
//                return i;
//            }
//        }
//        return 1;
        if(a==0) return b;
        return gcd(b%a,a);
    }
}
