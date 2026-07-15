import java.util.Scanner;
public class sumDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n ");
        int n=sc.nextInt();
        int lastDigit=0,sum=0;
        while(n>0){
            lastDigit=n%10;
            sum+=lastDigit;

            n=n/10;
        }
        System.out.println(sum);
    }
}
