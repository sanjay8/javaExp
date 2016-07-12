import java.util.Scanner;
public class PlusOne {
    public int[] plusOne1(int[] digits) {
        
         long sum=0;
        int n = digits.length;
        int digitFlag =0;
        int j = 0;
	
	if (digits[n-1]<9)
	{
		int n1 = digits[n-1];
		n1 = 1 + n1;
		digits[n-1] = n1;
		return digits;
		
	}
	else{
	for ( int i = n-1; i >= 0 ; i--)
	{
		//int digit;
		
		sum = sum + (long)Math.pow(10, n - 1 - i)*digits[i];
		
	}
	sum = sum + 1;
	
	for(int i = 0; i<=n-1; i++)
	{
	    if(digits[i] == 9)
	    {
	        digitFlag++;
	    }
	
	}
	if ( digitFlag == n)
	{
	    j = n+1;}
	    
	else {  j = n;}
	
	int digits1[] = new int [j];
	for ( int i = j-1; i>=0; i-- )
	{
		long digit = sum%10;
		digits1[i] = (int) digit;
		sum = sum/10;
	}
	return digits1;
	}
    
}}
    