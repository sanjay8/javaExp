import java.util.Scanner;

public class main1 {
	public static void main(String args[])
    {
    	System.out.println("enter the no. of elem !");
    	Scanner scn = new Scanner (System.in);
    	int num = scn.nextInt();
    	int arr[] = new int[num];
    	for ( int i = 0; i<num; i++)
    	{
    		arr[i] = scn.nextInt();
    	}
    	PlusOne p = new PlusOne();
    	int arrtest[] = p.plusOne1(arr);
    	int len = arrtest.length;
    	for ( int i = 0; i<len; i++)
    	{
    		System.out.print(arrtest[i]) ;
    	}
    	
    }
    }

