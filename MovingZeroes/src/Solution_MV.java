import java.util.Vector;
public class Solution_MV {
	public Vector<Integer> moving_zeroes(Vector<Integer> arr1)
	{
		int count=0;		
		int arr1_size = arr1.size();
		for (int i = 0; i<arr1_size; i++)
		{
			if (arr1.elementAt(i)==0)
			{
				arr1.removeElementAt(i);
				count++;
				i=i-1;
				arr1_size = arr1_size-1;
				
				
			}
		}
		for (int i = 0; i<count; i++)
		{
			arr1.addElement(0);
		}
		return arr1;
	}

}