import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 1,4,4,2
 * op 4 two times
 */

public class PraticeClass {

	public static void main(String[] args) {
		String str="FB";
		String str2="FB";
		
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put(str, 10);
		hm.put(str2, 50);
		System.out.println(hm);
		if(true)
			return;
		System.out.println(hm.get("abc"));
		//this entrySet() method gets all data and puts into set 
		Set s1=hm.entrySet();
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			if(m1.getKey().equals("abc")){
				m1.setValue("50000");
			}
		}
		System.out.println(hm);
	}

}
