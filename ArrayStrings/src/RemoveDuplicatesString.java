import java.util.HashSet;
import java.util.Set;

/*
 * i/p Java
 * o/p jav
 * use HashSet as hash set doesnot allow duplicate
 */

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		String str="Java";
		Set<Character> set=new HashSet<Character>();
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(!set.contains(ch))//adds if char not present in HashSet
			{
				set.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb);
		//set has not preserved order so problem  in HashSet
		//	System.out.println(set);
	}

}
