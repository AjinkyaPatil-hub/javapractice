/*
 * compare two string without API
 */
public class Comparing2StringWithoutApi {

	public static void main(String[] args) {
		String str1="javasa";
		String str2="javaaaaa";

		boolean isCompare=false;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i)){
				 isCompare=false;
				 break;
			}else{
				isCompare=true;
			}
		}
		System.out.println("string are"+isCompare);
	}

}
