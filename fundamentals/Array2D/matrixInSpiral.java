package Array2D;
import java.util.Scanner;
public class matrixInSpiral {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiral(int [][]matrix,int r,int c){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElements=0;
        while(totalElements<r*c){
            for(int j=leftCol;j<=rightCol && totalElements<r*c;j++){
                System.out.println(matrix[topRow][j]+" ");
            }
            totalElements++;
            topRow++;
            for(int i=topRow;i<=bottomRow && totalElements<r*c;i++){
                System.out.println(matrix[i][rightCol]+" ");
            }
            totalElements++;
            rightCol--;
            for(int j=rightCol;j>=leftCol && totalElements<r*c;j--){
                System.out.println(matrix[bottomRow][j]+" ");
            }
            totalElements++;
            bottomRow--;
            for(int i=bottomRow;i>=topRow && totalElements<r*c;i--){
                System.out.println(matrix[i][leftCol]+" ");
            }
            totalElements++;
            leftCol++;
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
        printSpiral(a,r1,c1);
    }
}
