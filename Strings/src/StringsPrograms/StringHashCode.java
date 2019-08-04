package StringsPrograms;

import java.util.HashMap;

public class StringHashCode {
	@Override
	public int hashCode() {
		System.out.println("Hash code method :");
	return super.hashCode();
}
@Override
public boolean equals(Object obj) {
	
	return super.equals(obj);
}	
	public static void main(String[] args) {
		
//		HashMap<String,Integer> hm=new HashMap<>();
//		hm.put("a", 2);
		
		
//		String s=new String("ABC");
		StringBuffer s2=new StringBuffer("ABCcde"); 
		StringBuffer s=new StringBuffer("ABCcde");

		if(s==s2){
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		}
		
		if(s.equals(s2)){
			System.out.println("equal");
		}else
			System.out.println("not equal");
	}

}
