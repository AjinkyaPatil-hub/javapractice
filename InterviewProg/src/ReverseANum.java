/*
 * 54321->> 12345
 */
public class ReverseANum {

	public static void main(String[] args) {
		String str="Ajinkya karych aai";
		int count=0;
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++){
			ch[i]= str.charAt(i);
			if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)))
			{
				count++;
				
			}
		}
		System.out.println(count);
	}

}
