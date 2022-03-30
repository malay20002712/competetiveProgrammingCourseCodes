import java.util.*;
class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        HashMap <Integer, Integer> map = new HashMap <> ();
        for (int i = 0; i < arr.length; i++) {
            map.put (arr [i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            
            int c = target - arr [i];
            if (map.containsKey (c) && map.get (c) != i) {
                return new int [] {i, map.get (c)};
            }
            
        }
        return null;
        
    }
}