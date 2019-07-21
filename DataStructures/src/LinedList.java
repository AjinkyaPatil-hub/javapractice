//all code uploaded to git 
public class LinedList {

	 //Node is the class which create the node structure By creating 
	//Node head ,head is the refernce var. which points to the first node an head is [pointing to that node
	Node head;
	
	
	public void insertNode(int data)
	{
		//creating new node
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		
		
		//check if the node is first or not
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newNode;
	//		newNode.next=null;
		}
	
		
		}
	
	public void printNode()
	{
		Node n=head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
		
	}
	
	
	public void addNodeStart(int data)
	{	
		Node newNode=new Node();
		newNode.data=data;
		
		if(head==null)
		{
			head=newNode;
			newNode.next=null;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	
	
	
	public void insertAnyLocatio(int index,int data){

		Node newNode=new Node();
		newNode.data=data;
		if(index==0)
		{
			addNodeStart(data);
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			newNode.next=n.next;
			n.next=newNode;

		}
	}
	
	public void insertAtEnd(int data)
	{	
		Node newNode=new Node();
		newNode.data=data;
			if(head==null)
		{
			head=newNode;
			newNode.next=null;
		}
		else
		{
			Node n=head;
			while(n.next != null)
			{
				n=n.next;
			}
			n.next=newNode;
			//newNode.next=null;
		}
	}
	
	public void deleteAt(int index){
		Node n1;
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			n1=null;
			//System.out.println(n1);
		}
	}
	
	public void deleteLastNode()
	{
		if(head==null)
		{
			System.out.println("Node not present");
			return;
		}
		else
		{	
			Node secondlast=head;
			while(secondlast.next.next!=null)
			{
				secondlast=secondlast.next;
			}
			secondlast.next=null;
		}
		
		
	}
	
	public void deletAtFirst()
	{
		if(head==null)
		{
			System.out.println("no element to delete");
		}
		else
		{
			Node delete=head;
			head=head.next;
			delete=null;
		}
	}
	
	
	
}
