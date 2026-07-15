package Array;
import java.util.Scanner;
public class reversingUsingExtraArray {
    static int[] reverse(int []arr){
        int n= arr.length;
        int []ans=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
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
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []ans=reverse(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(" "+ans[i]);
        }

    }
}
