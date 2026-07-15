package Strings;
import java.util.Arrays;
import java.util.Scanner;

public class annagram {
    public static boolean agrams(String s1,String s2){
        char[]arr1=s1.toCharArray();
        char[]arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])  return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String s2=sc.nextLine();
       boolean result = agrams(s1,s2);
        System.out.println(result);

    }
}
