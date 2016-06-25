package merge;

import java.util.Scanner;
public class MergeSort {
	
	public int[] mergesort(int a[], int l, int m, int r )
	{
		// size of temporary array 
		int n1 = m - l + 1;
		int n2 = r - m;
		
		// temporary array
		int left_temp[] = new int [n1];
		int right_temp[] = new int [n2];
		
		// filling of temp array
		for ( int i = 0; i<n1; i++)
		{
			left_temp[i]=a[i+l];
		}
		for( int i = 0; i<n2; i++)
		{
			right_temp[i] = a[m+1+i];
		}
		
		// sorting and merging
		int i = 0, j = 0;
		
		//initial index of merged subarry
		int k = l;
		
		while(i<n1 && j<n2)
		{
			if (left_temp[i]<right_temp[j])
			{
				a[k]=left_temp[i];
				i++;
			
			}
			
			//if ( left_temp[i] > right_temp[j])
			else
			
			{
				a[k] = right_temp[j];
				j++;
			}
			
			k++;
		}
		
		// filling up elements that are left up and is in in sorted order eg [6 9 ] [7 8 ]
		// so after the above [ 6 7 8 ] [9]
		
		while(i<n1)
		{
			a[k] = left_temp[i];
			i++;
			k++;
		}
		while(j<n2){
			a[k] = right_temp[j];
			j++;
			k++;
		}
		
		return a;
	}
	
	
	public void sort ( int a[], int l , int r)
	{
		if (l<r)
		{
			int m = (l+r)/2;
			sort(a, l, m );
			sort(a, m+1, r);
			
			mergesort(a, l, m, r );
		
		}
		
		
	}
	
	
	
	
	
	public void sort(int arr[])
	{
		if (arr.length<2)
		{
			//return ;
		}
		else 
		{
			  sort(arr,0, arr.length-1 );
		}
		
	}
	
	// printing of the sorted array
	public void printSorted(int a[])
	{
		System.out.println(" ");
		System.out.println(" printing of the sorted array");
		for( int i = 0; i < a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main (String args[])
	{
		System.out.println ( " No. of element you wish to enter ");
		Scanner scn = new Scanner (System.in);
		int no = scn.nextInt();
		int arr[] = new int[no];
		for( int i = 0; i < no ; i++)
		{
			arr[i] = scn.nextInt();
		}
		scn.close();
		// printing of the unsorted array
		
			System.out.println("printing of the unsorted array");
			for( int i = 0; i < arr.length ; i++)
			{
				System.out.print(arr[i]+" ");
			}
		
		MergeSort ms = new MergeSort();
		ms.sort(arr);
		ms.printSorted(arr);
		
		
	}
}