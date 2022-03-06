import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception 
	 {
	    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	    int t = Integer.parseInt (br.readLine ());
    	while (t-- > 0) {
    	    
    	    int c = 0;
    	    int n = Integer.parseInt (br.readLine ());
    	    for (int i = 1; i <= n; i++) {
    	        
    	        int sum = ;
    	        int multiplySum = ;
    	        
    	        if (gcd (findQuadraticSum (i), multiplySum (i)) > 1) {
    	            c++;
    	        }
    	        
    	    }
    	    System.out.println (c);
    	       
	    }
	 }
	 
	 static int multiplySum (int x) {
	     
	     int val = 0;
	     int sum = 1;
	     while (x > 0) {
	         
	         val = x % 10;
	         if (x == 0) {
	             sum = sum * 1;
	         } else {
	             sum = sum * (x % 10);
	         }
	         x /= 10;
	         
	     }
	     return sum;
	     
	 }
	 
	 static int findQuadraticSum (int x) {
	     
	     int sum = 0;
	     while (x > 0) {
	         
	         sum += (int) Math.pow (x % 10, 4);
	         x = x / 10;
	         
	     }
	     return sum;
	     
	 }
	 
	  static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
	 
}