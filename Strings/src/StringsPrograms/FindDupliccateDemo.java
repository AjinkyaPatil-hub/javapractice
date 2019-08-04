package StringsPrograms;

import java.util.HashMap;

public class FindDupliccateDemo {

	public static void findDuplicate(String string){
		String[] strsplit=string.split(" ");
		HashMap<String, Integer>hm=new HashMap<>();
		for(String tempstr:strsplit){
			if(hm.get(tempstr)!=null)//if true then duplicate is there
			{
				hm.put(tempstr, hm.get(tempstr)+1);
			}else
			{
				hm.put(tempstr, 1);	
			}
			
		}
		System.out.println(hm);
	}
	
	

	public static void findDuplicateOfChar(String string) {
		HashMap<Character, Integer> hm=new HashMap<>();
		
		for(int i=0;i<string.length();i++){
			char c=string.charAt(i);
			if(hm.get(c)!= null)
			{
				hm.put(c, hm.get(c)+1);
			}else
			{
				hm.put(c, 1);
			}
			
		}
		System.out.println(hm);
	}
	
	
	public static void main(String[] args) {
		findDuplicateOfChar("hello hel");
		//findDuplicate("I am am Learning java java");
	}




}
