package Array;

import java.util.Scanner;

public class findSecondMin {
    static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    static int secondMin(int []arr){
        int Min=findMin(arr);
        for(int i=0;i< arr.length;i++) {
            if (arr[i] == Min) {
                arr[i] = Integer.MAX_VALUE;

            }
        }
        int secondMin=findMin(arr);
        return secondMin;
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
        System.out.println("second min "+secondMin(arr));


    }
}
