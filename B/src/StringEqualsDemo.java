
public class StringEqualsDemo {

	public static void main(String[] args) {
		
		String str1=new String("aji nkya");
		String str2="ajinkya";
		String st3=str1.substring(2, 5);
		System.out.println(st3);
		
		if(str1==str2) 
			System.out.println("equals");
		else
			System.out.println("not equal");
		
		if(str1.equals(str2))
			System.out.println("equals");
		else
			System.out.println("not equal");
		
	}

}
