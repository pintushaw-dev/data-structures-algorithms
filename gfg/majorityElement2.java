import java.util.*;

public class majorityElement2 {
    public static ArrayList<Integer> majority(int []arr) {
        ArrayList<Integer> ans = new ArrayList<>();
//        finding candidate
        int candidate1=0,candidate2=0;
        int count1=0,count2=0;
        for(int nums:arr){
            if(nums==candidate1)
                count1++;
            else if (nums==candidate2) {
                count2++;

            }
            if(count1==0){
                candidate1=nums;
                count1=1;
            }
            else if(count2==0){
                candidate2=nums;
                count2=1;
            }
            else {
                count1--;
                count2--;
            }
        }
// verifying and counting candidate
        count1=0;
        count2=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==candidate1){
                count1++;
            }
            if(arr[i]==candidate2){
                count2++;
            }


        }
        if(count1>arr.length/3){
            ans.add(candidate1);
        }
        if(count2> arr.length/3){
            ans.add(candidate2);
        }
        Collections.sort(ans);
        return ans;

    }

    public static void main(String[] args) {
        int []arr={2,2,3,1,3,2,1,1};
        ArrayList<Integer> result=majority(arr);
        System.out.println(result);

    }
}
