import java.util.Scanner;
import java.util.Vector;

public class Operation {
	
	public static void main (String args [])
	{
		System.out.println("Enter the no of node to be inserted in the tree !");
		Scanner scn = new Scanner (System.in);
		int array_size = scn.nextInt();
		int input[] = new int [array_size];
		System.out.println("Enter the items to be inserted in the tree !");
		for (int i = 0; i < array_size; i++)
		{
			input[i] = scn.nextInt();
		}
		
		BinaryTree bt = new BinaryTree ();
		
		for (int i = 0; i<input.length; i ++)
		{
			bt.insert(input[i]);
		}
		System.out.println("Enter the lookup item in the tree !");
		int lookup_item = scn.nextInt();
		scn.close();
		boolean value = bt.lookup(lookup_item);
		System.out.println( "Does "+lookup_item +" exist in the tree that we created ? " + value );
		System.out.println("the maxDepth of the tree is : " + bt.maxDepth());
		
		Vector <Integer> v = bt.preOrder_traversal();
		int v_elements = v.capacity();
		System.out.println("printing the pre order traversal ");
		for (int i = 0; i < v_elements+1; i++)
		{
			
			System.out.println(v.elementAt(i));
		}
		

}
}