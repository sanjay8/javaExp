import java.util.Arrays;




public class Anagram {
public boolean isAnagram(String s, String t) {
	char[] ch1 = s.toCharArray();
	char[] ch2 = t.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	s = String.copyValueOf(ch1);
	t = String.copyValueOf(ch2);
	if (s.equalsIgnoreCase(t))
		return true;
	else return false;
	
	
	
}

}
