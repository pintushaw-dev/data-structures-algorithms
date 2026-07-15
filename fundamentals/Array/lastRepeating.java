package Array;

import java.util.Scanner;

public class lastRepeating {
    static int last_Repeating(int []arr){
        int an=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    an=arr[i];

                }
            }
        }
        return an;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("repeating element "+ last_Repeating(arr));

    }
}
