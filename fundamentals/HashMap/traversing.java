package HashMap;

import java.util.HashMap;

public class traversing {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("payal",19);
        map.put("pintu",20);
        map.put("aditya",21);
        map.put("deepak",21);
        System.out.println(map.get("pintu"));
        for (String key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
//class Solution {
//    public boolean isSubset(int a[], int b[]) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < a.length; i++) {
//            if (map.containsKey(a[i])) {
//                map.put(a[i], map.get(a[i] + 1))
//            } else {
//                map.put(a[i],1);
//            }
//        }
//        for (int i = 0; i < b.length; i++) {
//            if (!map.containsKey(b[i]) || map.get(b[i] == 0))
//                return false;
//        map.put(b[i], map.get(b[i]) - 1);
//        return true;
//    }
//
//
//    }
//}
