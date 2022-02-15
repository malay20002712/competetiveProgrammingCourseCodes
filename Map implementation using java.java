package competitiveProgramming;

import java.io.*;

class Node <K, V> {
     
     K data1;
     V data2;
     Node <K, V> next;
     public Node (K data1, V data2) {
          
          this.data1 = data1;
          this.data2 = data2;
          this.next = null;
          
     }
     
}

interface Map <K, V> {
     
     void put (K a, V b);
     V get (K a);
     void getKeySet ();
     void getMapElements ();
     
}

class HashMap <K, V> implements Map <K, V> {
     
     Node <K, V> head = null;
     public void put (K data1, V data2) {
          
          if (head == null) {
               head = new Node <K, V> (data1, data2);
          } else {
              
        	  Node <K, V> ptr = head;
        	  while (ptr.next != null) {
        		  if (ptr.data1 == data1) {
        			  ptr.data2 = data2;
        		  }
        		  ptr = ptr.next;
        	  }
        	  if (ptr.data1 == data1) {
        		  ptr.data2 = data2;
        	  }
        	  ptr.next = new Node <K, V> (data1, data2);
        	  
          }
          
     }
     
     public boolean containKey (K data) {
    	 Node <K, V> ptr = head;
    	 while (ptr != null) {
    		 if (ptr.data1 == data) 
    			 return true;
    		 ptr = ptr.next;
    	 }
    	 return false;
     }
     
     public V get (K key) {
    	  
	      Node <K, V> ptr = head;
	      while (ptr != null) {
	           if (ptr.data1 == key) {
	        	   return ptr.data2;
	           }
	           ptr = ptr.next;
	      }
	      return null;
          
     }

	@Override
	public void getKeySet() {
		
		System.out.print("[");
		Node <K, V> ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data1 + " ");
			ptr = ptr.next;
		}
		System.out.print("]");
	}
	
	public void getMapElements () {
		
		Node <K, V> ptr = head;
		while (ptr != null) {
			System.out.println(ptr.data1 + " " + ptr.data2);
			ptr = ptr.next;
		}
		
	}
     
}

public class Main_class {
     
     public static void main (String [] args) throws Exception {
          
          Map <Integer, Integer> map = 
        		  new HashMap <Integer, Integer> ();
          map.put (1, 1);
          map.put (2, 1);
          map.put (3, 1);
          map.getMapElements ();
          
     }
     
}
