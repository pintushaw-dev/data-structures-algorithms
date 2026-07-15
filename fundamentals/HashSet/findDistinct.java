package HashSet;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.HashSet;

public class findDistinct {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(34);arr.add(45);arr.add(56);arr.add(24);
       int result= distinct(arr);
        System.out.println(" elements "+result);

    }
    static int distinct(ArrayList<Integer> arr){
        HashSet<Integer> set=new HashSet<>();
        for(int ele:arr){
            set.add(ele);

        }
        return set.size();

    }


}
