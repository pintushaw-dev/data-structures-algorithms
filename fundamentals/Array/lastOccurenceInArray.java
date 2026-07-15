package Array;

import java.util.Scanner;

public class lastOccurenceInArray {
    static int lastOccurence(int []arr,int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size ");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("enter array element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter no to be count ");
        int x=sc.nextInt();
        System.out.println("last index of  x "+ lastOccurence(arr,x));

    }
}
