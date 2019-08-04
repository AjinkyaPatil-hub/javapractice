import java.util.Comparator;
import java.util.TreeSet;

/*
 * Comparator is used in treeset
 * When it is used 
 * When we want our /customised compare method on objects/we want our 
 * own sorting techniques then we cannot use INBUILD Comparable Interface
 * We have to create out own Comparator class
 */
/*
 * Qns To insert Integer Obj into treeset ,where sorting order should be in 
 * 		decending( natural is asscending)
 */
public class ComparatorDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new MyComparatorExercise());
		ts.add("B");
		ts.add("A");
		ts.add(new StringBuffer("ABC"));
		ts.add(new StringBuffer("XX"));
		ts.add("AA");
		ts.add("ABCD");
		ts.add("A");		
		System.out.println(ts);
		
	}

}

class MyComparatorString implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String str= o1.toString();
		String str2= o2.toString();
		
		return str2.compareTo(str);
		
		//		String a=(String)o1;
//		String b=(String)o2;		
//		return -a.compareTo(b);
	}
	
}

	class MyComparatorExercise implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			String str=o1.toString();
			String str2=o2.toString();
			
			if((str.length()>str2.length())){
				
				return +1;
			}else if(str.length()<str2.length()){
				
				return -1;
			}else{
				return str.compareTo(str2);	
			}
			
		}
		
	}