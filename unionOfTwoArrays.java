package competitiveProgramming;

import java.io.*;
import java.util.*; 

public class unionOfTwoArrays {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader 
				(new InputStreamReader (System.in));
		String [] str = br.readLine ().trim ().split (" ");
		String [] str2 = br.readLine ().trim ().split (" ");
		int [] arr = new int [str.length];
		int [] arr2 = new int [str2.length];
		for (int i = 0; i < arr.length; i++)
			arr [i] = Integer.parseInt (str [i]);
		
		for (int i = 0; i < arr2.length; i++)
			arr2 [i] = Integer.parseInt (str2 [i]);
		
		ArrayList <Integer> l = union (arr, arr2);
		for (Integer i : l) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n" + l.size ());
		
	}
	
	static ArrayList <Integer> union (int [] arr, int [] arr2) {
		
		HashSet <Integer> h = new LinkedHashSet <> ();
		for (int i : arr)
			h.add (i);
		
		for (int i : arr2)
			h.add (i);
		
		ArrayList <Integer> l = new ArrayList <> (h);
		return l;
		
	}

}
