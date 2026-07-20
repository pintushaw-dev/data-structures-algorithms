import java.util.ArrayList;

public class localMinAndMax {
    public ArrayList<Integer> minAndMax(int []arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        ans.add(arr[0]);
        int dir = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                continue;
            ;
            int currdir = (arr[i] > arr[i -1]) ? 1 : -1;
            if (dir == 0) {
                dir = currdir;
            } else if (currdir != dir) {
                ans.add(arr[i - 1]);
                dir = currdir;
            }

        }
        if(ans.get(ans.size()-1)!=arr[n-1])
            ans.add(arr[n-1]);

        return ans;

    }
    public static void main(String[] args) {
        int[]arr= {6, 4, 2, -2, 5, 3, 2, 2, -1, -1, 4};
        localMinAndMax obj=new localMinAndMax();
        System.out.println(obj.minAndMax(arr));



    }
}
