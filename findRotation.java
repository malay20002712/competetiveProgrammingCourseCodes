package competitiveProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class findRotation {

	static 
    BufferedReader br = 
        new BufferedReader (new InputStreamReader (System.in));
        
public static void main(String[] args) throws Exception {
		
		String [] str = br.readLine ().trim().split(" ");
		int arr [] = new int [str.length];
		enter (str, arr);
		int x = search (arr);
		System.out.println(x);
		
	}

	private static int search (int arr []) {
		
		int l = 0, r = arr.length - 1;
		
		while (l <= r) {
			
			if (arr [l] <= arr [r]) {
				
				return l;
				
			}
			
			int mid = l + (r - l) >> 1;
			
			int next = (mid - 1 + arr.length) % arr.length;
			int prev = (mid - 1) % arr.length;
			
			if ((arr [mid] <= arr [next])
					&& (arr [mid] <= arr [prev])) {
				
				return mid;
				
			} else if (arr [mid] >= arr [l]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
			
		}
		
		return -1;
		
	}

	private static void enter(String[] str, int arr []) {
	
		int i = 0;
		for (String s : str) {
			
			arr [i] = Integer.parseInt(s);
			i++;
			
		}
		
	}

}
