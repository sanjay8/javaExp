import java.util.Vector;
//import java.util.Arrays;
import java.util.HashSet;
public class Solution {

public Vector<Integer> intersection(Vector<Integer> nums1, Vector<Integer> nums2) {

//Vector<Integer> v1 = new Vector<Integer> (Arrays.asList(nums1));	
int nums2_size = nums2.size();
Vector<Integer> vec_result = new Vector<Integer> ();
for ( int i=0; i < nums2_size; i++)
{
	if (nums1.contains(nums2.get(i)))
	{
		vec_result.addElement(nums2.get(i));
	}
}

return new Vector<Integer> ( new HashSet<Integer>( vec_result ) );
}

		


}