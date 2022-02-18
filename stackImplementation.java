//Node class
import java.io.*;
class Node <E> {
	
	E data;
	Node <E> next;
	
	public Node (E data) {
		this.data = data;
		this.next = null;
	}
	
}

//Stack Implementation using linked list

class Stack <E> {
	
	int size = 0;
	Node <E> head;
	public void push (E data) {
		if (isEmpty ()) {
			head = new Node <E> (data);
			size++;
		} else {
			Node <E> temp = new Node <E> (data);
			temp.next = head;
			head = temp;
			size++;
		}
	}
	
	public E pop () {
	     
	     if (isEmpty ()) {
	          return null;
	     }
	     E stack_data = head.data;
	     head = head.next;
	     --size;
	     return stack_data;
	}
	
	public boolean isEmpty () {
		return head == null;
	}
	
	public int size () {
	     return this.size;
	}
	
	public StringBuffer checkElements () {
	     
	     Node <E> temp = head;
	     StringBuffer sb = new StringBuffer ();
	     sb.append ("[");
	     while (temp != null) {
	          sb.append (temp.data);
	          if (temp.next != null)
	               sb.append (",");
	          temp = temp.next;
	     }
	     sb.append ("]");
	     return sb;
	}
	
	public E peek () {
	     return head.data;
	}
	
}

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		Stack <String> q = new Stack <> ();
		for (int i = 1; i <= 4; i++) {
		     q.push (br.readLine ());
		}
		System.out.println(q.checkElements ());
	     System.out.println(q.size ());
	     q.pop ();
	     System.out.println(q.checkElements ());
	     System.out.println(q.size ());

	}

}