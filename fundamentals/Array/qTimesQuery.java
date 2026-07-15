package Array;
import java.util.Scanner;
public class qTimesQuery {
    static int [] makeFrequency(int []arr){
        int []freq=new int[100005];
        for (int i = 0; i <arr.length; i++) {
            freq[arr[i]]++;

        }
        return freq;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array ");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []freq=makeFrequency(arr);
        System.out.println("enter no of queries ");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter to be searched ");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }


    }

    }

