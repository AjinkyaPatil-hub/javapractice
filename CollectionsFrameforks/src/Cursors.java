import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;


public class Cursors {

	public static void main(String[] args) {

		//example of ListIterator
		LinkedList<String> l=new LinkedList<String>();
		l.add("ABCD");
		l.add("QWER");
		l.add("OKJH");
		ListIterator<String> ltr=l.listIterator();
		String prev="";
		while(ltr.hasNext())
		{
			String str=ltr.next();
			if(str.equals("ABCD"))
				ltr.remove();
			else if(str.equals("OKJH"))
				ltr.add("EEEEE");
			else if(str.equals("QWER"))
				ltr.set("AAAAA");
			
		}
		System.out.println(l);
		
		
		
		if(true)return;
		////example of Itterator 
		ArrayList<Integer> al=new ArrayList<Integer>();

		al.add(7);
		al.add(6);
		al.add(60);
	System.out.println(al);
	Iterator<Integer> itr=al.iterator();		
	while(itr.hasNext())
		{	
			Integer i= (Integer)itr.next();
			if(i%2==0){
				System.out.println(i);
			}
			else{
				itr.remove(); 
			}
			
		}
		System.out.println(al);
		
		if(true)
			return;
		//example of Ennumeration 
		
		Vector<Integer> v=new Vector<Integer>();
		v.addElement(45);
		v.addElement(87);
		v.addElement(98);
		
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements()){
			Integer i =e.nextElement();
			if(i%2==0){
				System.out.println(i);
			}
		}
	

		
	}

}
