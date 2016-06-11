import java.util.Vector;

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
  
// finds the depth using the recursive function and a helper recursive function 
  
  public int maxDepth()
  {
	  return (maxDepth(root));
  }
  
  public int maxDepth(Node node)
  {
	  if ( node == null )
	  {
		  return(0);
	  }
	  else 
	  {
		  int l_depth = maxDepth(node.left);
		  int r_depth = maxDepth (node.right);
		  
		  return ( Math.max(l_depth,r_depth)+1);
	  }
  }
  
  


/* Recursive function to invert the binary tree 
 * using a helper function and pre - order traversal
 * traversed node stored in a vector 
 */

	public Vector<Integer> preOrder_traversal ()
	{
		return (preOrder_traversal(root));
	}
	
	public Vector < Integer> preOrder_traversal(Node node)
	{
		if (node == null )
		{
			return null ;	
		}
		
		else{
			Vector <Integer> vec = new Vector<Integer> ();
			vec.addElement(node.data);
			preOrder_traversal(node.left);
			preOrder_traversal(node.right);
			return vec; 
		}
	}
	

}


































