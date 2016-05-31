import java.util.Scanner;
import java.util.LinkedList;
public class Deletion {
	public LinkedList<Integer> delete(LinkedList<Integer> linkedlist)
	{
	System.out.println("enter the node to be deleted");
	Scanner scn = new Scanner (System.in);
	int rem_index = scn.nextInt();
	linkedlist.remove(rem_index);
	scn.close();
	return linkedlist;
	
	}

}
