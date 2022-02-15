import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception {
	     
	     BufferedReader br = 
	                    new BufferedReader (new InputStreamReader (System.in));
	     String [] weight = br.readLine ().trim ().split (" ");
	     String [] values = br.readLine ().trim ().split (" ");
	     
	     int [] w = new int [weight.length];
	     int [] v = new int [weight.length];
	     
	     for (int i = 0; i < weight.length; i++) {
	          w [i] = Integer.parseInt (weight [i]);
	     }
	     
	     for (int i = 0; i < values.length; i++) {
	          v [i] = Integer.parseInt (values [i]);
	     }
	     
	     int target = Integer.parseInt (br.readLine ());
	     int X = knapSack (w, v, target, weight.length);
	     System.out.println(X);
	     
	}
	
	static int knapSack (int [] weight, int [] values, int W, int n) {
	     
	     if (n == 0 || W == 0) {
	          return 0;
	     } else if (weight [n - 1] > W) {
	          return knapSack (weight, values, W, n - 1);
	     } else {
	          return Math.max (values [n - 1] + knapSack (weight, values, W - weight [n - 1], n - 1), knapSack (weight, values, W, n - 1));
	     }
	     
	}
	
}
