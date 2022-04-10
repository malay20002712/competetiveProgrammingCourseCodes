class Solution {
    public int findDuplicate(int[] arr) {
     
        Arrays.sort (arr);
        int x = findDp (arr);
        return x;
        
    }
    
    private int findDp (int [] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            
            int x = findDuplicate (arr, arr [i], true);
            int y = findDuplicate (arr, arr [i], false);
            
            int v = Math.abs (x - y);
            if (v > 0) {
                return arr [i];
            }
            
        }
        return -1;
        
    }
    
    private int findDuplicate (int [] arr, int target, boolean v) {
        
        int l = 0, r = arr.length - 1;
        int value = -1;
        while (l <= r) {
            
            int diff = (r - l) >> 1;
            int mid = l + diff;
            if (arr [mid] == target) {
                
                value = mid;
                if (v) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
                
            } else if (arr [mid] < target) {
                l = mid + 1;
            } else if (arr [mid] > target) {
                r = mid - 1;
            }
            
        }
        return value;
        
    }
    
}