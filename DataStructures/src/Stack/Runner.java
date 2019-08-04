package Stack;

public class Runner {

	public static void main(String[] args) {
//		DynamicStack stack=new DynamicStack();
//		stack.push(5);
//		stack.push(5);
//		stack.push(5);
//		stack.push(5);
//		stack.push(5);
//		stack.push(5);
//		stack.push(5);
//		stack.push(5);
//		
		Stack stack=new Stack();
		stack.push(5);
		stack.push(50);
		stack.push(5);
		stack.push(5);
		int data=stack.pop();
		System.out.println(data);
		
		//		stack.push(5);
//		stack.push(50);
//		int peak= stack.peak();
////		System.out.println(peak);
////		int data=stack.pop();
////		System.out.println(data);
//
//		int size=stack.size();
//		System.out.println("size is"+ size);
//		
//		System.out.println(stack.isEmpty());
		stack.show();
		
	}

}
