package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class threeSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(45);
        arr.add(34);
        arr.add(24);
        arr.add(55);
        int tar = 79;
        boolean result = add(arr, tar);
        System.out.println(" elements " + result);

    }

    static boolean add(ArrayList<Integer> arr, int tar) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr) {
            int rem = tar - ele;
            if (set.contains(rem)) return true;
            set.add(ele);

        }
        return false;

    }
}


