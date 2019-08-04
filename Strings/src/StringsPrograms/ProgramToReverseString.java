package StringsPrograms;

public class ProgramToReverseString {

	public static void main(String[] args) {
		String str="position 1 no. @ durga is this";
		String rev="";
		int stlen=str.length();

//		for(int i=stlen-1;i>=0;i--){
//			char c=str.charAt(i);
//			System.out.print(c);
//		}
//		for(int i=str.length();i>=0;i--){
//			rev=rev+str.charAt(i);
//		}
//		
		str.toUpperCase();
		System.out.println(rev);
	}

}
