package oopsLab;
import java.util.*;
public class salesPersonproblem {
    static final int INF=999999;
    static int n=4;

    static int tsp(int mask,int pos,int[][]dp,int[][]dist){
        if(mask==(1<<n)-1)
            return dist[pos][0];
        if(dp[mask][pos]!=-1)
            return dp[mask][pos];
        int ans=INF;
        for(int city=0;city<n;city++){
            if((mask &(1<<city))==0){
                int newAns=dist[pos][city]+tsp(mask |(1<<city),city,dp,dist);
                ans=Math.min(ans,newAns);

            }
        }
        return dp[mask][pos]=ans;

    }

    public static void main(String[] args) {
        int [][]dist={
                {0,10,15,20},
                {10,0,35,40},
                {15,35,0,30},
                {20,25,30,0}
        };
        int [][]dp=new int[1<<n][n];
        for(int[]row:dp)
            Arrays.fill(row,-1);
        System.out.println("minm tour cost: "+tsp(1,0,dp,dist));
    }
}
