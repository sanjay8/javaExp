import java.util.LinkedList;
import java.util.Scanner;
public class LinkListCreation {
	public static void main ( String args [])
	{
		LinkedList<Integer> LL = new LinkedList<Integer>();
		System.out.println(" Enter the no. of elements in the LinkList");
		Scanner scn = new Scanner ( System.in );
		int ll_size = scn.nextInt();
	
		System.out.println(" Enter the elements in the LINKLIST !");
		for ( int i = 0; i < ll_size; i++)
		{
			LL.add(i, scn.nextInt());
		}
		Deletion del = new Deletion ();
		System.out.println(del.delete(LL));
		scn.close();
		
	}
}