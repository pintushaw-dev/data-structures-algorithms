import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int pow=1;
        while(n>0){
            int unit_digit=n%2;
            ans+=(unit_digit*pow);
            pow*=10;
            n/=2;

        }
        System.out.println(ans);
    }

}
