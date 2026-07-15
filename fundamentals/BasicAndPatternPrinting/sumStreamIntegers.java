import java.util.Scanner;
public class sumStreamIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n!=-1){
            sum+=n;
            n=sc.nextInt();
        }
        System.out.println(sum);

    }
}
