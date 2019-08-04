
//reverse a string with same format
//  i/p hello hi
// o/p olleh ih
package StringsPrograms;


public class StringReverseDemo {

	public static void main(String[] args) {
	
		String str="  to reverse string";
		StringBuilder sb=new StringBuilder();
		String[] words=str.split(" ");
		
		for(String word:words){
			String reverseString=new StringBuilder(word).reverse().toString();
			sb.append(reverseString+" ");
		}
		System.out.println(sb);
		System.out.println(sb.toString().toUpperCase().trim().concat(" \nI can call String methods on SB by toSting()"));
	}
}
