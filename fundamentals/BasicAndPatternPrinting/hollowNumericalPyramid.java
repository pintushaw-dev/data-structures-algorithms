import java.util.Scanner;
public class hollowNumericalPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows ");
        int r=sc.nextInt();
//        System.out.println("enter no of column ");
//        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            System.out.print(i);
            if(i>=2 && i<r){
            for(int k=1;k<=(2*i-3);k++) {
                System.out.print(" ");
            }
            System.out.print(i);
            }
            if(i==r){
            for(int l=1;l<(2*i-1);l++) {
                System.out.print(i);
            }
            }
            System.out.println();
            }

        }
    }
