package competitiveProgramming;

import java.util.*;
import java.io.*;

public class validString {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader 
				(new InputStreamReader (System.in));
		
		String str = br.readLine ();
		if (isValidString (str)) {
			
			System.out.println(str + " is Valid");
			
		} else {
			System.out.println(str + " is not valid");
		}
		
	}
	
	static boolean isValidString (String str) {
		
		int count = 0;
		for (int i = 0; i < str.length (); i++) {
			
			if (str.charAt (i) == '*') {
				count = 2;
			} else if (str.charAt (i) == '0') {
				count--;
				if (count < 0) {
					return false;
				}
			}
			
		}
		
		return true;
		
	}

}
