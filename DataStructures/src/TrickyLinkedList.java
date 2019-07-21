
public class TrickyLinkedList {

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
	
	
	
	public void remDupFromSortedList()
	{
		Node curr = head; 
		  
        while (curr != null) { 
             Node temp = curr; 
            while(temp!=null && temp.data==curr.data) { 
                temp = temp.next; 
            } 
            curr.next = temp; 
            curr = curr.next; 
        
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
}
