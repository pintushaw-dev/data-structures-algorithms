package Array;
import java.util.Scanner;
public class decreaseArraySortBySquare {
    static void swap(int i,int j){
        int temp=i;
        i=j;
        j=temp;
    }
    static void reverse(int []arr){
        int i=0,j=arr.length;
        while(i<=j){
            swap(i,j);
            i++;j--;
        }
    }
     static int[] sortSquares(int []arr){
        int n=arr.length;
        int left=0,right=n-1;
        int []ans=new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else {
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length ");
        int n= sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []ans=sortSquares(arr);
        reverse(ans);
        for(int i=0;i<n;i++){
            System.out.println(" "+ans[i]);
        }
    }
}
