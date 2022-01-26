import java.io.*;
import java.util.*;

class Node {
	
	int data;
	Node next;
	
	Node (int data) {
		
		this.data = data;
		this.next = null;
		
	}
	
}

class LinkedList {
	
	Node head;
	void add (int data) {
		
		if (head == null) {
			head = new Node (data);
		} else {
			
			Node d = head;
			while (d.next != null) {
				d = d.next;
			}
			d.next = new Node (data);
			
		}
	}
	
	void reverse () {
		
		Node prev = null;
		Node next = null;
		Node current = head;
		
		while (current != null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		head = prev;
		
	}
	
	void output () {
		
		Node op = head;
		while (op != null) {
			
			System.out.print(op.data + " ");
			op = op.next;
			
		}
		
	}
	
}

public class Main {

public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String [] str = br.readLine ().trim ().split (" ");
		int [] arr = new int [str.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr [i] = Integer.parseInt (str [i]);
			
		}
		
		LinkedList l = new LinkedList ();
		for (int i = 0; i < arr.length; i++) {
			
			l.add (arr [i]);
			
		}
		
		l.reverse ();
		l.output ();
		
	}

}
