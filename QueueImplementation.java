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

//Queue Implementation using linked list

class Queue <E> {
	
	int size = 0;
	Node <E> head;
	public void add (E data) {
		if (isEmpty ()) {
			head = new Node <E> (data);
			size++;
		} else {
			Node <E> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node <E> (data);
			size++;
		}
	}
	
	public E remove () {
		E d = head.data;
		head = head.next;
		--size;
		return d;
		
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
		Queue <String> q = new Queue <> ();
		for (int i = 1; i <= 4; i++) {
		     q.add (br.readLine ());
		}
		System.out.println(q.checkElements ());
	     System.out.println(q.size ());

	}

}