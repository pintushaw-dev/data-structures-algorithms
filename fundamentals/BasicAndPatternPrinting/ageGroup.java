import java.util.Scanner;
public class ageGroup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<12)
            System.out.println("child");
        else if (a>12 && a<18)
            System.out.println("teenage");
        else
            System.out.println("adult");

    }
}
