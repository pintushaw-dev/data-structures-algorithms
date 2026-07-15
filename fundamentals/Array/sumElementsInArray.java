package Array;

import java.util.Scanner;

public class sumElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n= sc.nextInt();
        int ans=0;
        int []arr=new int [n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            ans+=arr[j];
        }

        System.out.println(ans);

    }
}

