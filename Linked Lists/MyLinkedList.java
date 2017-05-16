import java.io.*;
import java.lang.*;
import java.util.*;

public class MyLinkedList< E > {
	private ListNode< E > head;
	private ListNode< E > tail;

	private ListNode <E> latest;
	private int size;

	public MyLinkedList ( ) {
		size = 0; 
		head = new ListNode < E > (null);
		tail = new ListNode < E > (null);
		latest = head;
		head.next = tail;
		tail.prev = head;
	}


	public void add( E data ) {
		size++;
		ListNode <E> addThis = new ListNode <E> (data);
		addThis.next = tail;
		tail.prev = addThis;		
		addThis.prev = 	latest;
		latest.next = addThis;
		latest = addThis;	
	}


	public void print () {
		ListNode <E> ptr = head.next;
		while  ( ptr.next != null ) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}

	public static void main (String [] args) {
		MyLinkedList <Integer > x = new MyLinkedList <Integer > ();
		x.add ( 1); x.add ( 2); x.add (3);
		x.print();
		MyLinkedList <String> y = new MyLinkedList <String > ();
		y.add("hey"); y.add("wassup");
		y.print();
 
	}
}



class ListNode <E> {

	ListNode < E > next;
	ListNode < E > prev;
	E data;

	public ListNode ( E theData ) {
		data = theData;
	}
}		
	 
