package competitiveProgramming;

import java.io.*;
import java.util.*;

public class findnextGreatestElement {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String [] str = br.readLine ().trim ().split (" ");
		int [] arr = new int [str.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr [i] = Integer.parseInt (str [i]);
			
		}
		
		int [] result = findNextGreaterElement (arr);
		for (int i : result) {
			
			System.out.print(i + " ");
			
		}
		
	}
	
	static int [] findNextGreaterElement (int [] arr) {
		
		int [] result = new int [arr.length];
		Stack <Integer> st = new Stack <> ();
		for (int i = arr.length - 1; i >= 0; i--) {
			
			if (st.isEmpty ()) {
				result [i] = -1;
			} else {
				
				 if (!st.isEmpty () && arr [i] < st.peek ()) {
					 
					 result [i] = st.peek ();
					 
				 } else if (!st.isEmpty () && arr [i] >= st.peek ()) {
					 
					 while (!st.isEmpty () && arr [i] >= st.peek ()) {
						 st.pop ();
					 }
					 
					 if (st.isEmpty ()) {
						 result [i] = -1;
					 } else {
						 result [i] = st.peek ();
					 }
					 
				 }
				
			}
			
			st.push (arr [i]);
			
		}
		return result;
	}

}
