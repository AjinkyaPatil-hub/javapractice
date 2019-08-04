/*
 * Program to create immutable class in java like String
 */
package StringsPrograms;

final public class ImmutableClass {

	//Step1: create var private
	private int i;
	
	 ImmutableClass(int i) {
		 this.i=i;
	 }
	
	 public ImmutableClass modify(int i){
		 //there is same content no need to create new obj return same obj.i.e this
		 if(this.i==i)
		 {
			 return this;
		 }
		 else
		 {
			 return new ImmutableClass(i);
		 }
		 
	 }
	
	public static void main(String[] args) {
		ImmutableClass t=new ImmutableClass(10);
		ImmutableClass t2=t.modify(100);
		ImmutableClass t3=t.modify(10);
		
		System.out.println(t==t2);//fasle
		System.out.println(t==t3);//true
		
	}

}
