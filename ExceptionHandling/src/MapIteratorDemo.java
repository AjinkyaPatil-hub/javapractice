import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapIteratorDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		HashMap hm=new HashMap();
		hm.put("av", 10);
		hm.put("v", 100);
		hm.put("va", 1000);
		hm.put("s", 20);
		System.out.println(hm);
		//i want to fetch object one by one by itreator()
		//this is an Method of Map.Entry  
		//all map objects will get stored in Set
		Set s1=hm.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			if(m1.getKey().equals("av")){
				m1.setValue("1000000");
			}
			
		}
		
		System.out.println(hm);
	}

}
