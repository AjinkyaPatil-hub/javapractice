import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
	
	if(true)
		return;
		String s = "abca";
		for(int i=0;i<s.length();i++){
			boolean unique=true;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					unique=false;
					break;
				}
			}
			if(unique)
			{
				System.out.println(s+"first char:"+ s.charAt(i));
				break;
			}
		}

		//by using index of method
		char[] c= s.toCharArray();
		for(char cc:c){
			if(s.indexOf(cc)==s.lastIndexOf(cc)){
				System.out.println("first non rep:"+cc);
				break;
			}
		}
	}
	

}
