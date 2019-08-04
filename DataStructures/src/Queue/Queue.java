package Queue;

public class Queue {

	int[] queue=new int[5];
	int front,rear,size;

	public void enEnqueue(int data)
	{
		queue[rear]=data;
		rear=(rear+1)%5;
		size=size+1;
	}
	public void show()
	{
		for(int i=0;i<size;i++){
			System.out.print(queue[(front+i)%5]+" ");
		}
	}
	public int deQueue()
	{
		int deElem= queue[front];
		front=(front+1)%5;
		size=size-1;
		return deElem;
	}
}
