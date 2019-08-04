import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;


public class ComparatorDemo {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet(new MyComparator());
		ts.add(5);
		ts.add(50);
		ts.add(1);
		ts.add(3);
		ts.add(7);
		System.out.println("comparator sorting order:"+ts);
		//question using comparator two different keys can we do
		TreeMap tm=new TreeMap();
		tm.put( "sa",5);
		tm.put( "b",2);
//		tm.put(3, "c");
//		tm.put(1, "d");
		System.out.println("natural sorting order:"+tm);
	}

}
	class MyComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Integer i1=(Integer)o1;
			Integer i2=new Integer((int) o2);
			
			
			return -i1.compareTo(i2);
		}
	
}