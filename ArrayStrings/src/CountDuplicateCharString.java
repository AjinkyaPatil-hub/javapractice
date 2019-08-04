import java.util.HashMap;
import java.util.Map;

/*
 * i/p Java
 * o/p a->2
 *    I want duplicates with key so HashMap
 */
public class CountDuplicateCharString {

	public static void main(String[] args) {

		String str="Hello";
		Map<Character, Integer> map=new HashMap<>();
		char[] ch= str.toCharArray();
		
		//check through for loop if char does not contains add to the map else increase the ccount i.e value
		
		for(Character c:ch)
		{
			if(!map.containsKey(c))//char present once
			{
				map.put(c, 1);
			}else
			{
				map.put(c, map.get(c)+1);
			}
		}
		System.out.println(map);
	}

}
