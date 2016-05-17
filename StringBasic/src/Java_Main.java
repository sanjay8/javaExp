import java.util.Scanner;

public class Java_Main {
public static void main ( String args[] ) 
{
	System.out.println("Enter two strings !" );
	Scanner scn = new Scanner ( System.in);
	String str1 = scn.nextLine();
	String str2 = scn.nextLine();
	scn.close();
	StringIntro obj = new StringIntro();
	System.out.println("The sum of length is "+ obj.get_length(str1, str2));
	obj.get_lex(str1, str2);
	System.out.println(obj.get_Upper(str1, str2));
}
	
}
