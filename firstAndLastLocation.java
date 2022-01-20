package competitiveProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class firstAndLastLocation {

public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		String [] str = br.readLine ().trim ().split (" ");
		int [] arr = new int [str.length];
		enter (str, arr);
		int target = Integer.parseInt (br.readLine ());
		int x = findFirst (arr, target);
		int y = findLast (arr, target);
		
		System.out.println("first location: " + x);
		System.out.println("last location: " + y);
		int ans = Math.abs(x - y) + 1;
		System.out.println("frequency of " + target + " = " + ans);
		
	}
	
	static int findFirst (int arr [], int target) {
	    
	    int res = 0, l = 0, r = arr.length - 1;
	    
	    while (l <= r) {
	        
	        int diff = (r - l) >> 1;
	        int mid = l + diff;
	        
	        if (arr [mid] == target) {
	            res = mid;
	            r = mid - 1; //r = mid - 1
	        } else if (arr [mid] < target) {
	            l = mid + 1;
	        } else {
	            r = mid - 1;
	        }
	        
	    }
	    return res;
	    
	}
	
	static int findLast (int arr [], int target) {
	    
	    int res = 0, l = 0, r = arr.length - 1;
	    
	    while (l <= r) {
	        
	        int diff = (r - l) >> 1;
	        int mid = l + diff;
	        
	        if (arr [mid] == target) {
	            res = mid;
	            l = mid + 1; //l = mid + 1
	        } else if (arr [mid] < target) {
	            l = mid + 1;
	        } else {
	            r = mid - 1;
	        }
	        
	    }
	    return res;
	    
	}
	
	static void enter (String [] str, int [] arr) {
	    
	    int i = 0;
	    for (String s : str) {
	        
	        arr [i] = Integer.parseInt (s);
	        i++;
	        
	    }
	    
	}
	
}
