package Array2D;
import  java.util.Scanner;
public class rotateArrayBy90 {
    static void printMatrix(int [][]matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    static void transpose_InPlace(int [][]a,int r,int c){
        for(int i=0;i<c;i++){
            for (int j = i; j < r; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    static void reverse(int []a){
        int i=0,j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }

    }
    static void rotate(int [][]a,int n){
        transpose_InPlace(a,n,n);
        for(int i=0;i<n;i++){
            reverse(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row 1");
        int r1=sc.nextInt();
        System.out.println("enter column 1");
        int c1=sc.nextInt();
        System.out.println("enter array elements");
        int [][]a=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
//        transpose_InPlace(a,r1,c1);
//        printMatrix(a);
        rotate(a,r1);
        printMatrix(a);
    }


}
