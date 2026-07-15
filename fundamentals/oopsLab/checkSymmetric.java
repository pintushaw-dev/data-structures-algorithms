//package oopsLab;
//
//import java.util.Scanner;
//
//public class checkSymmetric {
//        static void printMatrix(int [][]matrix){
//            for(int i=0;i< matrix.length;i++){
//                for(int j=0;j<matrix[i].length;j++){
//                    System.out.print(matrix[i][j] +" ");
//                }
//                System.out.println();
//            }
//        }
//        static void findTranspose(int [][]matrix,int r,int c){
//            boolean check=false;
////            int [][]transpose=new int [c][r];
//                for(int i=0;i<c;i++){
//                for(int j=0;j<r;j++){
//                    if(matrix[i][j]=matrix[j][i]){
//                    check=true;
//                    }
//                }
//            }
//            if(check==true){
//                System.out.println("symmetric ");
//            }
//            else {
//                System.out.println("not symmetric");
//            }
//        }
//
//        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("enter row 1");
//            int r1=sc.nextInt();
//            System.out.println("enter column 1");
//            int c1=sc.nextInt();
//            System.out.println("enter array elements");
//            int [][]a=new int [r1][c1];
//            for(int i=0;i<r1;i++){
//                for(int j=0;j<c1;j++){
//                    a[i][j]=sc.nextInt();
//                }
//            }
//            findTranspose(a,r1,c1);
//
//        }
//    }

