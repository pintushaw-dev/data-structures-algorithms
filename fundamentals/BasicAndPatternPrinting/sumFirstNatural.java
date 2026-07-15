import java.util.Scanner;
public class sumFirstNatural {
    public static void main(String[] args) {
        System.out.println("enter last no up to be sum ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            ans=ans+i;
        }
        System.out.println(ans);


    }
}
