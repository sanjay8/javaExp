import java.util.Scanner;
import java.util.Vector;
public class MV_Main {
	public static void main (String args[])
	{
		System.out.println("enter the no. of element you wish to enter!");
		Scanner scn = new Scanner(System.in);
		int array_size = scn.nextInt();
		Vector <Integer> vec = new Vector<Integer>();
		System.out.println("enter the elements");
		Scanner scn1 = new Scanner (System.in);
		for (int i = 0 ; i < array_size; i++)
		{
			vec.addElement(scn1.nextInt());
			
		}
		scn.close();
		scn1.close();
		Solution_MV s1 = new Solution_MV();
		System.out.println(s1.moving_zeroes(vec));
	}

}