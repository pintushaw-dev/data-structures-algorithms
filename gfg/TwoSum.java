import java.util.ArrayList;

public class TwoSum {
    public static ArrayList<Integer> twoSum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                ans.add(i + 1);
                ans.add(j + 1);
                return ans;
            } else if ((arr[i] + arr[j]) < target) {
                i++;

            } else {
                j--;
            }


        }
        ans.add(-1);
        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        int []arr= {2, 7, 11, 15};
        int target=9;
       ArrayList<Integer> result= twoSum(arr,target);
        System.out.println(result);
        

    }
}

