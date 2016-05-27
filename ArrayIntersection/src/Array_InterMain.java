import java.util.Scanner;
import java.util.Vector;
public class Array_InterMain {

public static void main ( String args [] ) 
{
System.out.println(" Specify the number of index for the 1st array " ) ;
Scanner scn = new Scanner ( System.in ) ;
int arr1_size = scn.nextInt();
System.out.println( " Enter the elements of the 1st array " ) ;
Vector <Integer> vec1 = new Vector<Integer> () ;
for( int i = 0; i < arr1_size; i++ ) 
{	

	vec1.addElement(scn.nextInt());
}
	
System.out.println(" Specify the number of index for the 2nd array " ) ;
Scanner scn1 = new Scanner ( System.in ) ;
int arr2_size = scn1.nextInt();
System.out.println( " Enter the elements of the 2st array " ) ;
Vector <Integer> vec2 = new Vector<Integer> () ;
for( int i = 0; i < arr2_size; i++ ) 
{	

	vec2.addElement(scn1.nextInt());
}

Solution s1 = new Solution ();
// = s1.intersection(vec1, vec2);
System.out.println ( " the intersection is " + s1.intersection(vec1, vec2) ) ;
scn.close();
scn1.close();
}
}