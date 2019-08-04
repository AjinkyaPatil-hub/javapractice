import java.util.Arrays;
import java.util.LinkedHashSet;


public class Test {

	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		String str="abc defa ff";
		
		StringBuilder reverse=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			reverse.append(str.charAt(i));
		}
		System.out.println(reverse);
		
		if(true)
			return;
		StringBuilder sb=new StringBuilder();
		char[] c1 = str.toCharArray();
		for(int i=0;i<c1.length;i++){
			if(!l.contains(c1[i])){
			l.add(c1[i]);
			sb.append(c1[i]);
			
			}
		}
		System.out.println(sb);
		

		char[] c = str.toCharArray();
		for(int i=0;i<c.length;i++)
		{	String s="";
			while(i<c.length && c[i] !=' ')
			{
				s=s+c[i];
				i++;
				
			}
			if(s.length()>0){
				System.out.println(s+":"+s.length());
			}
		}
				String[] arr= str.split(" ");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(" "+ch[i]);
		}
	}

}
