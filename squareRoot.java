package competitiveProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class squareRoot {

	static 
    BufferedReader br = 
        new BufferedReader (new InputStreamReader (System.in));
        
public static void main(String[] args) throws Exception {

	int a = Integer.parseInt(br.readLine());
	int x = squareRoot (a);
	System.out.println(x);
	
}

static int squareRoot (int a) {
    
    int res = 0;
    int l = 0, r = a;
    while (l <= r) {
        
        int mid = (r + l) >> 1;
        if (mid * mid == a) {
            return mid;
        } else if (mid * mid < a) {
            res = mid;
            l = mid + 1;
        } else {
            r = mid - 1;
        }
        
    }
    
    return res;
    
}

}

