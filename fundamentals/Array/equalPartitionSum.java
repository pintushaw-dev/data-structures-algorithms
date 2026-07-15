package Array;
import java.util.Scanner;
public class equalPartitionSum {
    static int arraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalPartition(int[] arr) {
        int totalSum = arraySum(arr);
        int prefsum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefsum += arr[i];
            int suffSum = totalSum - prefsum;
            if (suffSum == prefsum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("equal partition possible "+equalPartition(arr));
    }
}
