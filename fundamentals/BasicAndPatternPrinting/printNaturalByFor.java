import java.util.Scanner;
public class printNaturalByFor {
    public static void main(String[] args) {
        System.out.println("enter up to last no printing");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans;
        for (int i=1;i<=n;i++){
            ans=i;
            System.out.println(ans);

        }


    }
}
