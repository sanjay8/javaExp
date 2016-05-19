import java.util.StringTokenizer;

public class Token_Generator {

public void token(String s)
{
	StringTokenizer st = new StringTokenizer(s);
	while(st.hasMoreTokens())
	System.out.println(st.nextToken());
}
}