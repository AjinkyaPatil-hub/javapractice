package FileIO;

public class ProgramToReverseString {

	public static void main(String[] args) {
		String str="Ajinkya";
		String rev="";
		int stlen=str.length();

//		for(int i=stlen-1;i>=0;i--){
//			char c=str.charAt(i);
//			System.out.print(c);
//		}
		for(int i=stlen-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
