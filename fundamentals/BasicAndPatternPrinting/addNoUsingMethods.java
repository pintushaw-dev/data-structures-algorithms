import java.util.Scanner;
class algebra{
    static int add(int a,int b){
        int ans=a+b;
        return ans;
    }

}
public class addNoUsingMethods {
    public static void main(String[] args) {
        algebra obj=new algebra();// creating object
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=obj.add(x,y);// calling methods
        System.out.println(ans);


    }
}