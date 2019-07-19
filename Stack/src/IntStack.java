
public class IntStack {
	private int [] stack;
	private int top;
	private int size;
	
	//when user not give the size defalut size are given
	public IntStack(){
		top=-1;
		size=50;
		stack=new int[50];
	}
	
	//when the user gives the size
	public IntStack(int size){
		top=-1;
		this.size=50;
		stack=new int[this.size];
	}
	
	//push is used to add the item
	public boolean push(int item){
		if(!isFull()){
		top++; //-1 doesnot presnt in stack
		stack[top]=item;
		return true;
		}else{
			return false;
		}
	}
	//check for full
	public boolean isFull(){
		return (top == stack.length-1);
	}
	
	 //adding a value in stack
	public int pop(){
		return stack[top--];//top-- when it is poped it used point to its previous index
	}
	public boolean isEmpty(){
		return (top == -1);
	}
}
