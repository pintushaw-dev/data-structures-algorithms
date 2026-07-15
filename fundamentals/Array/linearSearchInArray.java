package Array;

import java.util.Scanner;

public class linearSearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int ans = -1;
        int[] arr = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the no to be found ");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ans=1;
                System.out.println("ans at the index "+i);
            }
        }
        if(ans==1){
            System.out.println("ans found");
        }
        else{
            System.out.println("not found");
        }

    }
}
