package competitiveProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllocationProblem {

public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
		    new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("enter the number of test cases: ");
		int t = Integer.parseInt (br.readLine ());
		
		while (t-- > 0) {
		    
		    System.out.println("enter the values into the array: ");
		    String [] str = br.readLine ().trim ().split (" ");
		    int arr [] = new int [str.length];
		    enter (str, arr);
		    System.out.println("enter the number of students among which you want to distribute books: ");
		    int k = Integer.parseInt (br.readLine ());
		    int s = sum (arr);
		    
		    int x = search (arr, s, k);
		    System.out.println(x);
		    
		}
		
	}
	
	static int search (int arr [], int s, int k) {
	    
	    int l = arr [0], r = s;
	    int res = 0;
	    while (l <= r) {
	        
	        int mid = (l + r) >> 1;
	        if (isValid (arr, mid, k)) {
	            
	            res = mid;
	            r = mid - 1;
	            
	        } else {
	            l = mid + 1;
	        }
	        
	    }
	    return res;
	    
	}
	
	static boolean isValid (int arr [], int barrier, int k) {
	    
	    int student = 1, pages = 0;
	    for (int i : arr) {
	        
	        if (i > barrier) {
	            return false;
	        } else if (pages + i > barrier) {
	            
	            pages = 0;
	            student++;
	            pages = pages + i;
	            
	        } else {
	            pages = pages + i;
	        }
	        
	    }
	    
	    return student > k ? false : true;
	    
	}
	
	static int sum (int arr []) {
	    
	    int sum = 0;
	    for (int i : arr) {
	        
	        sum += i;
	        
	    }
	    return sum;
	}
	
	static void enter (String [] str, int arr []) {
	    
	    int i = 0;
	    for (String s : str) {
	        
	        arr [i] = Integer.parseInt (s);
	        i++;
	        
	    }
	    
	}
	
}
