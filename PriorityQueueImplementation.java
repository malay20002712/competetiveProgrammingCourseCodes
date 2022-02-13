import java.io.*;
import java.util.*; 

class Node {
	 int data;
	 Node next;
	 
	public Node (int data) {
		this.data = data;
		this.next = null;
	}
	
}

class PriorityQueue {

	Node head = null;
	public void add (int data) {
		
		if (isEmpty ()) {
			head = new Node (data);
		} else if (head.next == null) {
			
			if (data > head.data) {
				head.next = new Node (data);
			} else if (data < head.data) {
				Node ptr = new Node (data);
				ptr.next = head;
				head = ptr;
			} 
		} else {
			Node ptr = head;
			if (data < head.data) {
				Node n = new Node (data);
				n.next = head;
				head = n;
			} else {
			     
				boolean test = false;
				Node n2 = head.next;
				while (n2 != null) {
					
					if (ptr.data < data && n2.data > data) {
						Node d = new Node (data);
						d.next = n2;
						ptr.next = d;
						test = true;
					}
					ptr = ptr.next;
					n2 = n2.next;
					
				}
				
				if (test == false) {
					ptr.next = new Node (data);
				}
				
			}
		}
		
	}
	
	public int getnthelement (int x) {
	     
	     int n = 1;
	     Node ptr = head;
	     while (ptr != null) {
	          
	          if (n == x) {
	               return ptr.data;
	          }
	          ptr = ptr.next;
	          n++;
	     }
	     return Integer.MIN_VALUE;
	     
	}
	
	public Map <Integer, Integer> getLocationElement (int data) {
	     
	     Map <Integer, Integer> map = new HashMap <> ();
	     Node ptr = head;
	     int c = 1;
	     boolean getValidation = false;
	     while (ptr != null) {
	          
	         if (ptr.data == data) {
	              map.put (data, c);
	              getValidation = true;
	              break;
	         }
	          ptr = ptr.next;
	          c++;
	     }
	     
	    if (getValidation == false) {
	         map.put (-1, -1);
	         return map;
	    } else {
	         return map;
	    }
	     
	}
	
	public boolean isPresent (int target) {
	     
	     Node ptr = head;
	     
	     while (ptr != null) {
	          
	          if (ptr.data == target) {
	               return true;
	          }
	          ptr = ptr.next;
	          
	     }
	     return false;
	}
	
	public int peek () {
		return !isEmpty () ? head.data : Integer.MIN_VALUE;
	}
	
	public int remove () {
		
		if (isEmpty ()) {
		     return Integer.MIN_VALUE;
		}
		int d = head.data;
		Node ptr = head;
		head = head.next;
		ptr.next = null;
		return d;
		
	}
	
	public boolean isEmpty () {
	     return head == null;
	}
	
	public void getQueue () {
		
		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}
		
	}
	
	public void sort (String str) {
		
		if (!isEmpty ())
		     if (str == "D") 
			     reverseQueue ();
		
	}
	
	public void clear () {
	     
	     head = null;
	     
	}
	
	private void reverseQueue () {
		
		Node prev = null, next = null, current = head;
		while (current != null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		
	}

}


public class Main {

	public static void main(String[] args) throws Exception, IOException {
		
		PriorityQueue pq = new PriorityQueue ();
		BufferedReader br = 
				new BufferedReader (new InputStreamReader (System.in));
		
		while (true) {
		     
		     System.out.println("enter 1 to enter data into PriorityQueue: ");
		     System.out.println("enter 2 to remove element from PriorityQueue: ");
		     System.out.println("enter 3 to peek element from PriorityQueue: ");
		     System.out.println("enter 4 to see all the elements in the PriorityQueue: ");
		     System.out.println("enter 5 to get the nth element in the PriorityQueue: ");
		     System.out.println("enter 6 to check if the element if present or not");
		     System.out.println("enter 7 to get the value and location of the given element: ");
		     System.out.println("enter 8 to clear the PriorityQueue: ");
		     
		     int ch = Integer.parseInt (br.readLine ());
		     
		     switch (ch) {
		          
		          case 1:
		               int value = Integer.parseInt (br.readLine ());
		               pq.add (value);
		          break;
		          
		          case 2:
		               System.out.println (pq.remove ());
		          break;
		          
		          case 3:
		               System.out.println(pq.peek ());;
		          break;
		          
		          case 4:
		               pq.getQueue ();
		          break;
		          
		          case 5:
		               System.out.println("enter the location where you want to get the element: ");
		               int n = Integer.parseInt (br.readLine ());
		               int v = pq.getnthelement (n);
		               System.out.println(v);
		          break;
		          
		          case 6:
		               System.out.println("enter the target which you want to search for: ");
		               if (pq.isPresent (Integer.parseInt (br.readLine ()))) {
		                    System.out.println("Yes");
		               } else {
		                    System.out.println("Not present");
		               }
		               
		          break;
		          
		          case 7:
		               int data = Integer.parseInt (br.readLine ());
		               Map <Integer, Integer> m = pq.getLocationElement (data);
		               System.out.println(data + " " + m.get (data));
		          break;
		          
		          case 8:
		               pq.clear ();
		               break;
		               
		          default: break;
		          
		     }
		     
		}
		
	}

}
