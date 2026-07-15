package Array2D;
import java.util.Scanner;
public class spiralSquareOrder {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] generateSpiral(int n){
        int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
        int [][]matrix=new int [n][n];
        int curr=1;
        while(curr<=n*n){
            for(int j=leftCol;j<=rightCol && curr<=n*n;j++){
                matrix[topRow][j]=curr;
                curr++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow && curr<=n*n;i++){
                matrix[i][rightCol]=curr;
                curr++;
            }
            rightCol--;
            for(int j=rightCol;j>=leftCol &&  curr<=n*n;j--){
                matrix[bottomRow][j]=curr;
                curr++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow && curr<=n*n;i--){
                matrix[i][leftCol]=curr;
                curr++;
            }

            leftCol++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row 1");
        int n=sc.nextInt();
//        System.out.println("enter column 1");
//        int c1=sc.nextInt();
//        System.out.println("enter array elements");
//        int [][]a=new int [n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                a[i][j]=sc.nextInt();
//            }
//        }
       int [][]ans=generateSpiral(n);
        printMatrix(ans);
    }
}

