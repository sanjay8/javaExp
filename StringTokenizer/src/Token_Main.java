import java.util.Scanner;
public class Token_Main	{
public static void main ( String args[] )
{
System.out.println("Enter the string");
Scanner scn = new Scanner(System.in);
String str = scn.nextLine();
Token_Generator tg = new Token_Generator();
tg.token(str);
scn.close();
}}	