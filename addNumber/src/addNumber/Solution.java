package addNumber;


public class Solution {

int addDigits (int num ) 
{

int len = (int)Math.log10(num)+1;
int sum = 0;

for ( int i = len; i>0; i--)
{
	int digit = num%10;
	num = num/10;
	sum = sum + digit ;
}

int sumLen = (int)Math.log10(sum)+1;
if ( sumLen != 1 ) 
{	
	System.out.println("test");
	Solution s2 = new Solution();
	return s2.addDigits(sum) ;
}
 return sum; 

}
} 