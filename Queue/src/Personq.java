
public class Personq {

	private Person[] q;
	private int size;
	private int front;
	private int rear;
	private int total;
	
	public Personq(){
		q=new Person[50];
		size=100;
		front=0;
		rear=0;
		total=0; 
	}
	
	public Personq(int size){
		q=new Person[this.size];
		this.size=100;
		front=0;
		rear=0;
		total=0;
	}
	
	public boolean enqu(Person item){
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
	
	public Person dque(){
		Person item= q[front];
		total--;
		front=(front+1)%size;
		return item; 
	}
	public void show(){
		int f=front;
		if(f!=total){
			for(int i=0;i<total;i++){
				System.out.println(" "+q[f].toString());
				f=(f+1)%size;
			}
		}
	}
}


