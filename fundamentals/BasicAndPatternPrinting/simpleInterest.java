import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principle");
        float P=sc.nextFloat();
        System.out.println("enter rate");
        float R= sc.nextFloat();
        System.out.println("enter time");
        float T=sc.nextFloat();
        float si=(P*R*T)/100;
        System.out.println("simple interst "+si);
    }

}
