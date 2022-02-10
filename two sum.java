import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String [] str = br.readLine ().trim ().split (" ");
		int [] arr = new int [str.length];
		
		for (int i = 0; i < arr.length; i++) {
		    arr [i] = Integer.parseInt (str [i]);
		}
		
		Arrays.sort (arr);
		System.out.println("enter the whole sum");
		boolean x = findTwoValues (arr, 0, arr.length - 1, Integer.parseInt (br.readLine ()));
		if (x) {
		    System.out.println("yes two variables exists");
		} else {
		    System.out.println("No such problems exists");
		}
		
	}
	
	static boolean findTwoValues (int [] arr, int i, int j, int sum) {
	    
	    while (i <= j) {
	        
	        if ((arr [i] + arr [j]) == sum) {
	            return true;
	        } else if ((arr [i] + arr [j]) < sum) {
	            i++;
	        } else if ((arr [i] + arr [j]) > sum) {
	            j--;
	        }
	        
	    }
	    return false;
	    
	}
	
}
