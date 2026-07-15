package Array;
import java.util.Scanner;
public class findSecondMax {
    static int findMAx(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }
        static int secondMx(int []arr){
        int Mx=findMAx(arr);
        for(int i=0;i< arr.length;i++) {
            if (arr[i] == Mx) {
                arr[i] = Integer.MIN_VALUE;

            }
        }
        int secondMax=findMAx(arr);
        return secondMax;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements ");
        int n = sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("second max "+secondMx(arr));


    }
}
