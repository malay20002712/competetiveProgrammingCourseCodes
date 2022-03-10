import java.io.*;
import java.util.*;
//Google Hash Code
public class Main
{
	public static void main(String[] args) throws Exception {
	     
	     BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	     int t = Integer.parseInt (br.readLine ());
	     
	     while (t-- > 0) {
     	     String [] str = br.readLine ().trim ().split (" ");
     	     HashMap <Character, Boolean> h = new HashMap <> ();
     	     initialiseHash (h);
     	     for (int i = 0; i < str.length; i++) {
     	          System.out.println(checkPanagrams (str [i], h));
     	     }
     	     initialiseHash (h);
	     }
	}
	
	static boolean checkPanagrams (String str, HashMap <Character, Boolean> h) {
	     
	     for (char i : str.toCharArray ()) {
	          
	          if (h.get (i) == false) {
	               h.put (i, true);
	          } else {
	               return false;
	          }
	          
	     }
	     return true;
	     
	}
	
	static void initialiseHash (HashMap <Character, Boolean> h) {
	     for (int i = 65; i <= 90; i++) {
	          if (!h.containsKey ((char) i)) {
	               h.put ((char)i, false);
	          }
     	}
     	
	     for (int i = 97; i <= 122; i++) {
	          h.put ((char) i, false);
	     }
	     
	}
	
}
