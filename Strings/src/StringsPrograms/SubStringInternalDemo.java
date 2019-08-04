/*
 * substring() in java 1.6 had a memory leak problem 
 */
package StringsPrograms;

public class SubStringInternalDemo {

	public static void main(String[] args) {

		String s="hey I am learning internal working of substring method";
		String str=s.substring(6, 8);
		System.out.println(str);
	}

}
