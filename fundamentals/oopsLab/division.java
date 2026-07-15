package oopsLab;
import java.util.Scanner;
public class division {
    public static void main(String[] args) {
        int a,b,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a:");
        a=sc.nextInt();
        System.out.println("enter value of b:");
        b= sc.nextInt();
        try{
            if(b==0){
                throw new ArithmeticException("divisible by zero is not allowed");
            }
            result =a/b;
            System.out.println("result ="+result);
        }catch (ArithmeticException e){
            System.out.println("Exception caught:" + e.getMessage());
        }

    }

}
