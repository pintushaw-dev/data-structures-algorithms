package Strings;

import java.util.Arrays;

public class mostFrequentCharacter {
    public static void main(String[] args) {
        String s="ppssskkkkk";
        int n=s.length();int maxfreq=-1;
        char ans=s.charAt(0);
        char []arr=s.toCharArray();
        Arrays.sort(arr);
        int i=0,j=0;
        while (j<n){
            if (arr[i]==arr[j]) j++;
            else{
                int freq=j-i;
                if(freq>maxfreq){
                    maxfreq=freq;
                    ans=arr[i];
                }
                i=j;
            }
        }
        int freqq=j-i;
        if(freqq>maxfreq){
            maxfreq=freqq;
            ans=arr[i];
        }
        System.out.println(ans);
    }
}
