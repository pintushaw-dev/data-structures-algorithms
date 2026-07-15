package Array;
import java.util.Scanner;
public class rotateArray {
    static int[] rotate(int []arr,int k){
     int n=arr.length;
        k=k%n;
        int []ans=new int [n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j]=arr[i];
            j++;
        }
        for(int i=0;i<n-k;i++){
            ans[j]=arr[i];
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length ");
        int n=sc.nextInt();
        System.out.println("enter array elements ");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter no of times to be rotate ");
        int k=sc.nextInt();
        int []ans=rotate(arr,k);
        for(int i=0;i<n;i++){
            System.out.println(" "+ans[i]);
        }
    }

}
