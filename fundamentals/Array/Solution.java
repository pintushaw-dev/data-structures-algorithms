package Array;

import java.util.ArrayList;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            if(nums[i]==nums[j] && i-j<=k) {
                return true;
            }


        }
        return false;

    }
}


