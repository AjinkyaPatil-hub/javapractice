package Stack;

public class DynamicStack {
		int capacity=2;
		int[] stack=new int[capacity]; 
		int top=0;
		
		public void push(int data){
			if(size()==capacity){
				expand();	
			}
			stack[top]=data;
			top++;
		}

		public int size(){
			return top;
		}
		
		private void expand() {
			int length=size();
			int newStack[]=new int[capacity*2];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack=newStack;
			capacity*=2;
			
		}

		public void show(){
			for(int i:stack){
				System.out.print( i+ " ");
			}
		}
		
		public int pop(){
			int data = 0;
				if(isEmpty()){
					System.out.println("Stack is empty");
					
			}else{
				
				top--;
				data =stack[top];
				stack[top]=0;
				shirnk();
					
			}
			return data;
		}
		private void shirnk() {
			int length=size();
			if(length<=(capacity/2)){
				capacity=capacity/2;
			}
			int newArray[]=new int[capacity];
			System.arraycopy(stack, 0, newArray, 0, length);
			stack=newArray;
			
		}

		//return top most element
		public int peak(){
			int data;
			data =stack[top-1];
			
			return data;
			
		}
		
		
		//whenever the method is return always boolean value
		public boolean isEmpty(){
			return top<=0;
			
			//		if(top==0)
//				return false;
//			else
//				return true;
//			
		}

	

}
