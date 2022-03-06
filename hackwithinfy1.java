import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int t = Integer.parseInt (br.readLine ());
		int count = 0;
		while (t-- > 0) {
		     
		     String [] str = br.readLine ().trim ().split (" ");
		     int [] arr = new int [str.length];
		     for (int i = 0; i < str.length; i++) {
		          arr [i] = Integer.parseInt (str [i]);
		     }
		     
		     int x = (int) Math.pow (2, arr [0]);
		     int y = (int) Math.pow (2, arr [1]);
		     
		     int first = x + 1;
		     int countData = findOutData (x, y);
		     count += countData;
		}
		System.out.println(count);
		
	}
	
	static int findOutData (int x, int y) {
	     
	     String bst = null;
	     int c = 0;
	     for (int i = x + 1; i < y; i++) {
	          
	          bst = Integer.toBinaryString (i);
	          if (checkPallindromme (bst)) {
	               
	               c++;
	               
	          }
	          
	     }
	     return c;
	     
	}
	
	static boolean checkPallindromme (String str) {
	     
	     if (str.charAt (str.length () - 1) == '0') {
	          return false;
	     }
	     StringBuffer sb = new StringBuffer (str);
	     sb.reverse ();
	     String s = sb.toString ();
	     return s.equals (str);
	}
	
	private static void swap (char [] c, int i, int j) {
	     
	     char ch = '\0';
	     ch = c [i];
	     c [i] = c [j];
	     c [j] = ch;
	     
	}
	
}
