package Array;
import java.util.Scanner;
public class rotateInPlaceArray {

    static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate_Inplace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n- 1);
        reverse(arr,  0, n - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length ");
        int n = sc.nextInt();
        System.out.println("enter array elements ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter no of rotation ");
        int k = sc.nextInt();
        rotate_Inplace(arr,k);
        for (int x:arr) {
            System.out.println(" " + x);
        }
    }
}


