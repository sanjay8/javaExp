import java.util.Scanner;
public class CheckDuplicates {
	
	// flag to indicate duplicacy
	int flag = 0;
	

	public void conquer(int a[], int l, int m, int r)
	{
		
		int n1 = m - l + 1 ;
		int n2 = r - m;
		
		int Ltemp[] = new int[n1];
		int Rtemp[] = new int[n2];
		
		for (int i = 0; i < n1; i++)
		{
			Ltemp[i] = a[l+i];
		}
		for ( int i = 0; i < n2; i++)
		{
			Rtemp[i] = a[m + 1 + i];
		}
		
		// local initial index value of the subarray
		int i = 0;
		int j = 0;
		
		// initial index value of the combined array
		int k = l;
		
		//
		while( i < n1 && j < n2)
		{
			if (Ltemp[i] < Rtemp[j])
			{
				a[k] = Ltemp[i];
				i++;
			}
			else if (Ltemp[i] > Rtemp[j])
				
			{
				a[k] = Rtemp[j];
				j++;
			}
			
			else {
				a[k] = Rtemp[j];
				j++;
				flag ++;
				k++;
				break;
			}
				
			k++;
		}
		
		// had to implement this too since the original array: 4 6 4 1 
		// became 4 6 1 1 
		
		// adding up the remainder of elements in the array
		
		while ( i < n1)
		{
			a[k] = Ltemp[i];
			i++;
			k++;
			
		}
		while(j < n2 )
		{
			a[k] = Rtemp[j];
			j++;
			k++;
		}
			
		}
	

	
	public void divide(int a[], int l, int r )
	{
		int m = (l + r)/2;
		
		if (l < r)
		{
			divide(a, l, m);
			divide(a, m+1, r);
			
			conquer(a, l, m, r );
		}
	}
	
	
	public void divide(int arr[])
	{
		divide(arr, 0, arr.length-1);
	}
	
	public boolean check()
	{
		if (flag > 0)
			return true;
		else return false;
	}
	
	
	
	
	public static void main ( String args[])
	{
		System.out.println("Enter the no of elements you wish to enter!");
		Scanner scn = new Scanner ( System.in);
		int no = scn.nextInt();
		int arr[]= new int[no];
		
		for (int i =0; i < no ; i++)
		{
			arr[i] = scn.nextInt();
		}
		
		System.out.print("The entered elements are :");
		for (int i = 0; i < no ; i++)
		{
			System.out.print(arr[i]+" " );
		}
		
		CheckDuplicates cd = new CheckDuplicates();
		cd.divide(arr);
		boolean b = cd.check();
		
		
		System.out.println ( " ");
		System.out.println(" Duplicates present ? " + b);
	}
}
