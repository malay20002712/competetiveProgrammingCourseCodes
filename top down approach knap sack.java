import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	    String [] value = br.readLine ().trim ().split (" ");
	    String [] weight = br.readLine ().trim ().split (" ");
	    
	    int [] v = new int [value.length];
	    int [] w = new int [weight.length];
	    
	    for (int i = 0; i < value.length; i++) {
	        
	        v [i] = Integer.parseInt (value [i]);
	        
	    }
	    for (int i = 0; i < weight.length; i++){
	        
	        w [i] = Integer.parseInt (weight [i]);
	        
	    }
		System.out.println("enter the maximum weight: ");
		int W = Integer.parseInt (br.readLine ());
		int x = knapSack (v, w, W);
		System.out.println(x);
	}
	
	static int knapSack (int [] v, int [] wt, int W) {
	    
	    int [][] res = new int [v.length + 1][W + 1];
	    for (int n = 0; n <= v.length; n++) {
	        
	        for (int w = 0; w <= W; w++) {
	            
	            if (n == 0 || w == 0) {
	                res [n][w] = 0;
 	            } else if (wt [n - 1] <= W) {
 	                res [n][w] = 
 	                    Math.max (v [n - 1] + res [n - 1][Math.abs (w - wt [n - 1])], res [n - 1][w]);
 	            } else {
 	                res [n][w] = res [n - 1][w];
 	            }
	            
	        }
	        
	    }
	    return res [v.length][W];
	    
	}
	
}
