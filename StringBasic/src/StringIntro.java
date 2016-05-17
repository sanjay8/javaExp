public class StringIntro
{
public int get_length(String a, String b)
{
	int l_str1 = a.length();
	int l_str2 = b.length();
	int sum = l_str1 +l_str2;
	return sum;
}

public void get_lex( String a, String b)
{	
	
	int i = a.compareTo( b);
	if (i>0)
	{ System.out.println("Yes, A is lexicographically larger than B"); }
	
	else if (i<0)
	{ System.out.println("No, A is lexicographically larger than B"); }
	else
	{ System.out.println("same sentences!");}
}


public String get_Upper( String a, String b)
{
	char c1 = a.charAt(0); 
	String s1 = String.valueOf(c1);	
	char c2 = b.charAt(0); 
	String s2 = String.valueOf(c2);
	String arr[]= new String[2];
	arr[0] = s1.toUpperCase();
	arr[1] = s2.toUpperCase();
	
	return arr[0]+arr[1];
}

		
}