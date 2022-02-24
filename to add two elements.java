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

class LinkedList {
     
     Node head;
     void add (int data) {
          
          if (head == null) {
               head = new Node (data);
          } else {
               
               Node ptr = head;
               while (ptr.next != null) {
                    ptr = ptr.next;
               }
               ptr.next = new Node (data);
               
          }
          
     }
     
     int getNumber () {
          
          int sum = 0;
          Node ptr = head;
          while (ptr != null) {
               sum = sum * 10 + ptr.data;
               ptr = ptr.next;
          }
          return sum;
          
     }
     
     void toLinkedList (String str []) {
          Node ptr = null;
          Node p = null;
          for (int i = 0; i < str.length; i++) {
               if (ptr == null) {
                    ptr = new Node (Integer.parseInt (str [i]));
                    p = ptr;
               } else {
                    ptr.next = new Node (Integer.parseInt (str [i]));
                    ptr = ptr.next;
               }
          }
          head = p;
     }
     
}

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
		          new BufferedReader (new InputStreamReader (System.in));
		LinkedList l = new LinkedList ();
		String n [] = br.readLine ().split ("");
		for (int i = 0; i < n.length; i++) {
		     l.add (Integer.parseInt (n [i]));
		}
		
		int x = l.getNumber ();
		x++;
		String str [] = Integer.toString (x).split ("");
		l.toLinkedList (str);
		x = l.getNumber ();
		System.out.println(x);
		
	}
	
}
