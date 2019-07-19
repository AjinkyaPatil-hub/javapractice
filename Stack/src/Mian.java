
public class Mian {

	public static void main(String[] args) {
		
//		IntStack is=new IntStack();
//		//first checking the stack is full or not
//		if(!is.isFull()){
//			is.push(5);
//			is.push(8);
//			is.push(9);
//			is.push(2);
//		}
//		
//		System.out.println(is.pop());
//		System.out.println(is.pop()); 
		
		//working with the objects
		Person p=new Person("abc", 12);
		Person p2=new Person("abcsad", 1);
		
		PersonStack ps=new PersonStack();
		
		ps.push(p);
		ps.push(p2);
		
		System.out.println(ps.pop().toString()); 
		System.out.println(ps.pop().toString());
		
	
	}

}
