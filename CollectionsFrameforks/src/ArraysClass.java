import java.util.Arrays;
import java.util.Comparator;


public class ArraysClass {

	public static void main(String[] args) {

String[] str={"abc","ssdd","fre"};
		
		int[] arr={8,5,6,7};
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		System.out.println("index of abc:"+Arrays.binarySearch(str, "abc"));
		
		System.out.println("Descending order by Comparator:"); 
		Arrays.sort(str, new MyComparatorArray());
		 System.out.println(Arrays.toString(str));
		System.out.println("Index of fre:"+ Arrays.binarySearch(str, "fre", new MyComparatorArray()));
		
	}

}

class MyComparatorArray implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String str=o1.toString();
		String str2=o2.toString();
		return str2.compareTo(str);


	}

	}


