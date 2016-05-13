package addNumber;
import java.util.Scanner;

public class AddMain {

public static void main ( String args[])
{

System.out.println("Enter the number!");
Scanner scn = new Scanner ( System.in );
int input = scn.nextInt();
scn.close();
Solution s1 = new Solution ();
System.out.println(s1.addDigits(input));

}
}