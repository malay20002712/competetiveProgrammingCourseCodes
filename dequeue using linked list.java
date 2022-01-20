import java.io.*;

class CircularQueue <E> {
    
    Node head;
    
    void enqueue_rear (E x) {
        
        Node <E> toAdd = new Node <E> (x);
        
        if (head == null) {
            head = toAdd;
            toAdd.next = head;
            return ;
        }
        
        else {
            Node <E> temp = head;
            
            if (temp.next == head) {
                Node <E> p = toAdd;
                temp.next = p;
                p.next = head;
                return ;
            }
            
            do {
                temp = temp.next;
            } while (temp.next != head);
            
            temp.next = toAdd;
            temp = temp.next;
            temp.next = head;
            
        }
        
    }
    
    void enqueue_front (E x) {
        
        Node <E> toAdd = new Node <E> (x);
        
        if (head == null) {
            head = toAdd;
            toAdd.next = head;
            return ;
        }
        
        else {
            
            Node <E> enter = toAdd;
            Node <E> temp = head;
            
            do {
                temp = temp.next;
            } while (temp.next != head);
            
            enter.next = head;
            head = enter;
            temp.next = head;
            
        }
        
    }
    
    void dequeue_rear () {
        
        Node <E> temp = head;
        do {
            
            temp = temp.next;
            
        } while (temp.next.next != head);
        
        temp.next = head;
        
    }
    
    void dequeue_front () {
        
        Node <E> temp = head;
        do {
            
            temp = temp.next;
            
        } while (temp.next != head);
        
        temp.next = head.next;
        head = head.next;
        
    }
    
    void display () {
        
        Node <E> ptr = head;
        do {
            
            System.out.print (ptr.data + "\t");
            ptr = ptr.next;
            
        } while (ptr != head);
        
    }
    
    E peek () {
        return (E) head.data;
    }
    
    static class Node <E> {
        
        E data;
        Node next;
        Node (E data) {
            this.data = data;
            this.next = null;
        }
        
    }
    
}

public class dequeueUsinglinkedlist {
    
    static String str;
    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    
    public static void main (String [] args) throws Exception {
        
        CircularQueue <String> cq = new CircularQueue <String> ();
        
        do {
            
            System.out.println("1. to add element into the CircularQueue.");
            System.out.println("2. to delete element from the rear end of CircularQueue.");
            System.out.println("3. to add element at the front end.");
            System.out.println("4. to delete element at the front end.");
            System.out.println("5. to see the peek element in the CircularQueue");
            System.out.println("6. to display all the elements present in the deQueue.");
            System.out.println("7. to close all operations.");
            System.out.println("enter your choice: ");
            int ch = 0;
            ch = Integer.parseInt (br.readLine ());
            
            switch (ch) {
                case 1:
                    System.out.println("enter the string which you want to enter: ");
                    str = br.readLine ();
                    cq.enqueue_rear (str);
                break;
                
                case 2:
                    cq.dequeue_rear ();
                break;
                
                case 3:
                    System.out.println("enter the String which you want to enter: ");
                    str = br.readLine ();
                    cq.enqueue_front (str);
                break;
                
                case 4:
                    cq.dequeue_front ();
                break;
                
                case 5:
                    System.out.println (cq.peek ());
                break;
                
                case 6:
                    cq.display (); System.out.println();
                break;
                
                case 7:
                    System.exit (10);
                break;
                
                default:
                    System.out.println("No such operation available: ");
        
            }
            
            
        } while (true);
        
    }
}
