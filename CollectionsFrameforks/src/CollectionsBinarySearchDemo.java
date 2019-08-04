import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CollectionsBinarySearchDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
//i want to perform sorting on arraylist and searching on arraylist yhen use Collections(class)
		
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("a");
		al.add("F");
		al.add("W");
		System.out.println("insertion order is preserved:"+al);//[A,a,F,W] insertion order is preserved
		Collections.sort(al);
		
		System.out.println("Defalut natural sorting order:"+al);
		System.out.println("Returns index of F: "+Collections.binarySearch(al, "F"));
		System.out.println("returns the insertion position where elem can beinserted:"+Collections.binarySearch(al, "z"));
		
		Collections.sort(al, new MyComparatorSearch());
		System.out.println("des sort:"+al);
		System.out.println("using myComparator F:"+Collections.binarySearch(al, "F", new MyComparatorSearch()));
		
		System.out.println("if not passing comparator obj index F:"+Collections.binarySearch(al, "F"));
		Comparator c=Collections.reverseOrder(new MyComparatorSearch());
	}

}

class  MyComparatorSearch implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String str=o1.toString();
		String str2=o2.toString();
		return str2.compareTo(str);
	}
	
}
