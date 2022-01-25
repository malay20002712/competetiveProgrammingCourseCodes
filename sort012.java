package competitiveProgramming;

import java.io.*;

public class sort012 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader 
				(new InputStreamReader (System.in));
		String [] str = br.readLine ().trim ().split (" ");
		int [] arr = new int [str.length];
		for (int i = 0; i < arr.length; i++) {
			
			arr [i] = Integer.parseInt (str [i]);
			
		}
		
		sort (arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}
	
	static void sort (int [] arr) {
		
		int low = 0, high = arr.length - 1;
		int mid = 0;
		
		while (mid < high) {
			
			switch (arr [mid]) {
			
			case 0:
				swap (arr, mid, low);
				mid++;
				low++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap (arr, mid, high);
				high--;
				
			}		
		}
		
	}
	
	static void swap (int [] arr, int x, int y) {
		
		int l = arr [x];
		int k = arr [y];
		
		l = l ^ k;
		k = l ^ k;
		l = l ^ k;
		
		arr [x] = l;
		arr [y] = k;
		
	}

}
