import java.util.Scanner;
public class NoOfOneBits {
	
	
	
	
	public int getNumber( int n)
	{
		int value = 0; int actual = n; int remain = n;
		int count = 0;
		while ( actual != 0 )
		{
			int pow = (int )(Math.log(remain)/Math.log(2));
			value = (int) Math.pow(2, pow);
			remain = actual - value;
			actual = remain;
			count ++;
		}
		return count;
		
	}
	
	
	
	
	
	
	public static void main(String args[])
	{
		System.out.println("enter the Integer");
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		NoOfOneBits ob = new NoOfOneBits();
		int number = ob.getNumber(n);
		System.out.println("The number of 1's are : "+ number);
		
	}
	
	
	

}
