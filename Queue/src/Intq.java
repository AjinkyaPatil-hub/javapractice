
public class Intq {
	private int[] q;
	private int size;
	private int front;
	private int rear;
	private int total;
	
	public Intq(){
		q=new int[50];
		size=100;
		front=0;
		rear=0;
		total=0; 
	}
	
	public Intq(int size){
		q=new int[this.size];
		this.size=100;
		front=0;
		rear=0;
		total=0;
	}
	
	public boolean enqu(int item){
		if(isFull()){
			return false;
		}
		else{
			total++;
			q[rear]=item;
			rear = (rear+1)%size;//used this logic when rear and front point to both 1st location.then rear points to 0
			return true;
		}
	}
	public boolean isFull(){
		if(size == total)
		return true;
		else
			return false;
	}
	
	public int dque(){
		int item=q[front];
		total--;
		front=(front+1)%size;
		return item; 
	}
	public void show(){
		int f=front;
		if(f!=total){
			for(int i=0;i<total;i++){
				System.out.println(" "+q[f]);
				f=(f+1)%size;
			}
		}
	}
}
