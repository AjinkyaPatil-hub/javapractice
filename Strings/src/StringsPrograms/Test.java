package StringsPrograms;

import java.util.StringTokenizer;

final public class Test {
	private int i;
	private Test(int i){
		this.i=i;
	}
	private Test modify(int i){
		if(this.i==i){
			return this;
		}else{
			return new Test(i);
		}
	}
	
	public static void main(String[] args) {
		String str="sas-sadasd";
		StringTokenizer st=new StringTokenizer(str,"-");
		while (st.hasMoreTokens()) 
		{
			System.out.println(st.nextToken());
		}
		
		
		if(true)
			return;
		Test t1=new Test(10);
		Test t2=t1.modify(100);
		Test t3=t1.modify(10);
		System.out.println(t1==t2);
		System.out.println(t1==t3);
	}

}
