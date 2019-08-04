
/*
 * i/p Hello World
 * o/p Hello-->5
 * 		World-->5	
 */

/*
 * Hello-->5
	World-->5
 */
public class CountingNumOfChar {

	public static void main(String[] args) {
	
	String str="Hello World";
	//convert in char array for traversing
	
	char[] ch= str.toCharArray();
	
	//itterate for loop from H to d
	
	for(int i=0;i<str.length();i++)
	{
		//create a string and store the result in it and print it
		String str2="";
		while(i<str.length() && ch[i]!=' ')
		{	//this while will complete till Hello and copy to str2
			str2=str2+ ch[i];
			i++;
		}
		if(str2.length()>0)
		{
			System.out.println(str2+"-->"+str2.length());
		}
	}
	
	}
}
