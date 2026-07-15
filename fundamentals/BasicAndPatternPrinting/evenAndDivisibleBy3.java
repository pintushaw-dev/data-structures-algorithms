import java.util.Scanner;
public class evenAndDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int a=sc.nextInt();
        if(a%2==0 && a%3==0)
            System.out.println("no divisible by 3 and is even");
        else
            System.out.println("not compatible");
    }
}
