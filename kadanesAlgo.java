package competitiveProgramming;
import java.io.*;

public class kadanesAlgo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader (new InputStreamReader (System.in));
		
		String [] str = br.readLine().trim ().split(" ");
		int arr [] = new int [str.length];
		int i = 0;
		for (String s : str)
			arr [i++] = Integer.parseInt(s);
		
		int sum = 0;
		int sum2 = 0;
		for (int j : arr) {
			
			sum = sum + j;
			
			if (sum > sum2) {
				sum2 = sum;
			}
			
			if (sum < 0) {
				sum = 0;
			}
			
		}
		
		System.out.println(sum2);
		
	}

}
