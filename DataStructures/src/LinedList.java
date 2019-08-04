//all code uploaded to git 
public class LinedList {

	// Node is the class which create the node structure By creating
	// Node head ,head is the refernce var. which points to the first node an
	// head is [pointing to that node
	static int count = 0;

	Node head;

	public void insertNode(int data) {
		// creating new node
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		// check if the node is first or not

		if (head == null) {
			head = newNode;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = newNode;
			// newNode.next=null;
		}

	}

	public void printNode() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		// to print last node in the list
		System.out.println(n.data);

	}

	public void addNodeStart(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (head == null) {
			head = newNode;
			newNode.next = null;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertAnyLocatio(int index, int data) {

		Node newNode = new Node();
		newNode.data = data;
		if (index == 0) {
			addNodeStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			newNode.next = n.next;
			n.next = newNode;

		}
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (head == null) {
			head = newNode;
			newNode.next = null;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = newNode;
			// newNode.next=null;
		}
	}

	public void deleteAt(int index) {
		Node n1;
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
			// System.out.println(n1);
		}
	}

	public void deleteLastNode() {
		if (head == null) {
			System.out.println("Node not present");
			return;
		} else {
			Node secondlast = head;
			while (secondlast.next.next != null) {
				secondlast = secondlast.next;
			}
			secondlast.next = null;
		}

	}

	public void deletAtFirst() {
		if (head == null) {
			System.out.println("no element to delete");
		} else {
			Node delete = head;
			head = head.next;
			delete = null;
		}
	}

	public int length() {
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public boolean search(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.next;

		}
		return false;
	}

	public void NthIndex(int index) {
		Node temp = head;

		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		System.out.println("the node at index: " + index + " is: " + temp.data);
	}

	public void NthIndexFromLast(int index) {
		Node temp = head;
		int len = 0;
		while (temp != null) {
			temp = temp.next;
			len++;
		}
		if (len < index) {
			return;
		}
		temp = head;
		for (int i = 1; i < len - index + 1; i++) {
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public void middle() {
		int leng = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			leng++;
		}
		temp = head;
		for (int i = 0; i < leng / 2; i++) {
			temp = temp.next;
		}
		System.out.println("the middle one data: " + temp.data);
	}

	public void countOccurance(int data) {
		int count = 0;
		Node temp = head;
		while (temp != null)
		{
			if (temp.data == data)
			{
				
				count++;
			}
			temp=temp.next;
		}
		System.out.println(data + " occured: " + count + " times");
	}
	public void isLoop(){
		Node temp1=head;
		Node temp2=head.next;
		
		while(temp1.next.next!=temp1 )
		{
			temp1=temp1.next;
			temp2=temp2.next;
		}
		if(temp1.next.next==temp1){
			System.out.println("loop present");
		}else{
			System.out.println("loop not present");
		}
	
	}
}
