import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int t = Integer.parseInt (br.readLine ());
		
		while (t-- > 0) {
		    
		    String [] str = br.readLine ().trim ().split (" ");
		    int [] arr = new int [str.length];
		    int target = Integer.parseInt (br.readLine ());
		    for (int i = 0; i < arr.length; i++)
		        arr [i] = Integer.parseInt (str [i]);
		    
		    int x = findNumberofRotations (arr);
		    System.out.println(x);
		    
		}
		
	}
	
	static int findNumberofRotations (int [] arr) {
	    
	    int l = 0, r = arr.length - 1;
	    while (l <= r) {
	        
	        int mid = l + (r - l) >> 1;
	        int prev = (mid - 1 + arr.length) % arr.length;
	        int next = (mid + 1) % arr.length;
	        
	        if (arr [l] <= arr [r]) {
	            return l;
	        } 
	        
	        if ((arr [mid] < arr [prev]) &&
	            (arr [mid] < arr [next])) {
	                return mid;
	        } else if (arr [l] < arr [mid]) {
	            l = mid + 1;
	        } else {
	            r = mid - 1;
	        }
	        
	    }
	    return 0;    
	    
	}
	
	
}
