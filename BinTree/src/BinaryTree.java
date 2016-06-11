import java.util.Scanner;

// BinaryTree.java 
public class BinaryTree { 
  // Root node pointer. Will be null for an empty tree. 
  private Node root; 
 

  /* 
   --Node-- 
   The binary tree is built using this nested node class. 
   Each node stores one data element, and has left and right 
   sub-tree pointer which may be null. 
   The node is a "dumb" nested class -- we just use it for 
   storage; it does not have any methods. 
  */ 
  private static class Node { 
    Node left; 
    Node right; 
    int data;

    Node(int newData) { 
      left = null; 
      right = null; 
      data = newData; 
    } 
  }

  /* 
   Creates an empty binary tree -- a null root pointer. 
  */ 
  BinaryTree ()
  {
	  root = null ;
  }

/* inserts the given data 
 * uses a recursive helper
 */
  
  public void insert (int item)
  {
	  root = insert (root, item);
  }

  public Node insert (Node node, int data_item)
  {
	  if (node == null )
	  {
		  node = new Node (data_item);
	  }
	  else
	  {
		  if (node.data>= data_item)
		  {
			  node.left = insert(node.left, data_item);
		  }
		  else {
			  node.right = insert (node.right, data_item);
		  }
	  }
	  
	  return node;
  }
  
/* searches the nodes for an item
 * uses recursive technique to do so
 */
  
  public boolean lookup (int item)
  {
	  return lookup(root, item);
  }
  
  public boolean lookup (Node node, int data_item )
  {
	  if (node == null )
	  {
		  return false;
	  }
	  else
	  {
	  if ( node.data == data_item)
	  {
		  return true;
	  }
	  
	  else 
	  {
	   if (node.data >= data_item )
		  {
			  return lookup (node.left, data_item);
		  }
		  
		  else 
		  {
			  return lookup (node.right, data_item);
		  }
		  
	  }
	  }
  }	
}











