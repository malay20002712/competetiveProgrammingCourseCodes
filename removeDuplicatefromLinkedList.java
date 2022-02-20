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
     
     void removeDuplicates () {
          
          HashSet <Integer> h = new HashSet <Integer> ();
          Node temp = head;
          Node t = null;
          Node current = null;
          while (temp != null) {
               if (h.add (temp.data)) {
                    if (t == null) {
                         t = new Node (temp.data);
                         current = t;
                    } else {
                         t.next = new Node (temp.data);
                         t = t.next;
                    }
               } 
               temp = temp.next;
          }
          head = current;
          
     }
     
     void showElements () {
          
          Node temp = head;
          while (temp != null) {
               System.out.print(temp.data + " ");
               temp = temp.next;
          }
          
     }
     
}

public class Main {
     
     public static void main (String [] args) throws Exception {
          
          BufferedReader br = 
               new BufferedReader (new InputStreamReader (System.in));
          int x = 0;
          LinkedList l = new LinkedList ();
          for (int i = 1; i <= 5; i++) {
               x = Integer.parseInt (br.readLine ());
               l.add (x);
          }
          l.removeDuplicates ();
          l.showElements ();
     }
     
}