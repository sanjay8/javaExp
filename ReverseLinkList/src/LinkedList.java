import java.util.Scanner;
public class LinkedList{
	
	Node head;
	
	LinkedList ()
	{
		head = null;
	}
	
	public static class Node { 
		
		Node next;
		int data;
		
		Node (int d)
		{
			data = d;
			next = null;
		}
	}

	// recursively inserting the elements
	public void insert(int d)
	{
		head = insert(head, d );
	}
	public Node insert(Node node, int data_item)
	{
		if (node == null)
		{
			node = new Node ( data_item);
		}
		else {
			node.next = insert(node.next, data_item);
		}
		
		return node;
		
	}
	
	// Print-testing the entered List
	public void printList()
	{
		System.out.println("The List is :");
		printList(head);
		System.out.println("");
	}
	public void printList(Node n)
	{
		while ( n != null)
		{
			System.out.print(" " + n.data);
			n = n.next;
		}
	}
	
/* Recursively reversing the list
 * 1. breaking the head away and pointing it to null
 * 2. combining the rest elements to the head
 * 
 */
	public void reverseList()
	{
		head = reverseList(null, head);
	}
	public Node reverseList(Node prev, Node curr)
	{
		if ( curr.next == null)
		{
			head = curr;
			curr.next = prev;
			return null;
		}
		
		Node next1 = curr.next;
		curr.next = prev;
		reverseList(curr, next1);
		return head;
	}
	
	// printing the REVERSE list
	
	public void printReverseList()
	{ 
		System.out.println("The reverse of the list is :");
		printReverseList(head);
	}
	public void printReverseList(Node n)
	{
		while(n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	
	
	
	
	
	public static void main (String args[] )
	{
		System.out.println("Enter the no. of nodes you wish to enter");
		Scanner scn = new Scanner (System.in);
		int no = scn.nextInt();
		System.out.println("Enter the elements! ");
		
		LinkedList ll = new LinkedList ();
		
		for ( int i = 0; i < no; i++)
		{
			ll.insert(scn.nextInt());
		}
		scn.close();
		// testing the entered List
		ll.printList();	
		// reversing the list
		ll.reverseList();
		ll.printReverseList();
	}
	
}