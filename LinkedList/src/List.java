public class List {
	
	Node head;
	
	public static class Node {
		
		int data;
		Node next ;
		
		Node (int d)
		{
			data = d ;
			next = null;
		}
	}
	
	public void printlist()
	{
		Node n = head ;
		while ( n!= null )
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
			
	}
	
	public void addHeadNode(int item)
	{
		Node n = new Node (item);
		n.next = head;
		head = n;
		System.out.println("");
		System.out.println ("Updated list after head addition:");
		while ( n!= null )
		{
			System.out.print (n.data + " ");
			n= n.next;
		}
		
		
	}
	
	public void addNode(Node info, int item)
	{
		Node nadded = new Node ( item);
		nadded.next = info.next;
		info.next = nadded; 
		System.out.println("");
		System.out.println ("Updated list after head addition:");
		Node n = head ;
		while ( n!= null )
		{
			System.out.print (n.data + " ");
			n= n.next; }
		
	}
	
	public   void deleteNode ( Node info)
	{
		info.data = info.next.data;
		info.next = info.next.next;
		System.out.println("");
		System.out.println ("Updated list after deletion addition:");
		Node n = head ;
		while ( n!= null )
		{
			System.out.print (n.data + " ");
			n= n.next; }
		
	} 
	
	public static void main (String args[])
	{
		List ls = new List ();
		ls.head = new Node(1);
		Node n1 = new Node (2);
		Node n2 = new Node (3);
		Node n3 = new Node (4);
		Node n4 = new Node (5);
		
		ls.head.next = n1; 
		n1.next = n2;
		n2.next = n3 ;
		n3.next = n4 ; 
		
		ls.printlist();
		ls.addHeadNode(0);
		ls.addNode(n2, 100);
		System.out.println("");
		ls.printlist();
		ls.deleteNode(n3);
		
		
	}
	
	
}