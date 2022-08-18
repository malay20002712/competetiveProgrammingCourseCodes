import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception {
	    
	  BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	  String [] str1 = br.readLine ().trim ().split (" ");
	  String [] str2 = br.readLine ().trim ().split (" ");
	  
	  int [] arrival = new int [str1.length];
	  int [] departure = new int [str2.length];
	  
	  for (int i = 0; i < arrival.length; i++) {
	      arrival [i] = Integer.parseInt (str1 [i]);
	  }
	  
	  for (int i = 0; i < departure.length; i++) {
	      departure [i] = Integer.parseInt (str2 [i]);
	  }
	  
	  int x = maxNoPlatform (arrival, departure);
	  System.out.println(x);  
	  
	}
	
	static int maxNoPlatform (int [] arrival, int [] departure) {
	    
	    int i = 1, j = 0;
	    
	    Arrays.sort (arrival);
	    Arrays.sort (departure);
	    
	    int platform = 1;
	    int maxplatform = 1;
	    while (i < arrival.length && j < departure.length) {
	        
	        if (arrival [i] <= departure [j]) {
	            platform++;
	            i++;
	        } else if (arrival [i] > departure [j]) {
	            platform--;
	            j++;
	        }
	        
	        maxplatform = Math.max (platform, maxplatform);
	        
	    }
	    
	    return maxplatform;
	    
	}
 	
}
