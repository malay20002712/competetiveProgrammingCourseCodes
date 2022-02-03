//find out the first kth smallest element
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int t  = Integer.parseInt (br.readLine ());
		
		while (t-- > 0) {
			
			String [] str = br.readLine ().trim ().split (" ");
			int [] arr = new int [str.length];
			int k = Integer.parseInt (br.readLine ());
			for (int i = 0; i < arr.length; i++) {
				arr [i] = Integer.parseInt (str [i]);
			}
			
			PriorityQueue <Integer> pq = new PriorityQueue <> ();
			for (int i : arr)	
				pq.add(i);
			
			for (int i = 1; i < k; i++) {
				pq.poll ();
			}
			
			System.out.println(pq.peek());
			
		}
		
	}

}
