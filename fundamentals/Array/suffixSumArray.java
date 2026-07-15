package Array;
import java.util.Scanner;
public class suffixSumArray {
     static int[] suffixSum(int[]arr){
        int n=arr.length;
        int[]suffix=new int[n];
        suffix[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=arr[i]+suffix[i+1];
        }
        return suffix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements ");
        for (int i=0;i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int [] suf=suffixSum(arr);
       for(int i=0;i<n;i++){
           System.out.print(" "+suf[i]);
       }
    }
}
