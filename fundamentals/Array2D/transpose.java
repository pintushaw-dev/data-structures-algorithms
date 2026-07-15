package Array2D;
/* 1 2 3           1 4
   4 5 6    ====== 2 5
                   3 6
 */
import java.util.Scanner;
public class transpose {
    static void printMatrix(int [][]matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    static int [][]findTranspose(int [][]matrix,int r,int c){
        int [][]transpose=new int [c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        return transpose;
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
        int [][]ans=findTranspose(a,r1,c1);
        printMatrix(ans);
    }
}
