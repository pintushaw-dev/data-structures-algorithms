package Array;
import java.util.Scanner;
public class swapping {
    static  void swap(int a,int b){
        int temp=a;// without third variable a=a+b;
        a=b;       //                        b=a-b;
        b=temp;    //                        a=a-b;

        System.out.println("after swapping a= "+a);
        System.out.println("after swapping b= "+b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        swap(x,y);

    }
}
