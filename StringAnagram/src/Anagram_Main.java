import java.util.Scanner;

public class Anagram_Main {
public static void main ( String args[] )
{
System.out.println("Enter the 1st string");
Scanner scn = new Scanner(System.in);
String str1 = scn.nextLine();
System.out.println("Enter the 2nd string");
String str2 = scn.nextLine();
Anagram a = new Anagram();
System.out.println("Str1 is an anagram of str2 :"+a.isAnagram(str1,str2));
scn.close();
}}