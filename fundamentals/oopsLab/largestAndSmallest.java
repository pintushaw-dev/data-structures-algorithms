package oopsLab;
import java.util.Scanner;
public class largestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows");
        int r = sc.nextInt();
        System.out.println("enter no column");
        int c = sc.nextInt();
        System.out.println("enter array elements");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int largest = arr[0][0];
        int smallest = arr[0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }

        }
        System.out.println("smallest "+smallest);
        System.out.println("largest "+largest);
    }
}
