
public class Runner {

	public static void main(String[] args) {
		LinedList ls=new LinedList();
		TrickyLinkedList tl=new TrickyLinkedList();
		
		tl.insertNode(18);
		tl.insertNode(32);
		tl.insertNode(87);
		tl.insertNode(87);
		tl.insertNode(889);
		tl.insertNode(8);
		tl.insertNode(15);
		tl.insertNode(15);
		tl.insertNode(15);
		
		tl.remDupFromSortedList();
		
		tl.printNode();	
		
		
		if(true)
			return;
		tl.remDupFromSortedList();
		ls.insertNode(18);
		ls.insertAtEnd(66);
		ls.insertNode(32);
		ls.insertNode(87);
		ls.insertNode(88);
		ls.insertNode(889);
		//ls.deletAtFirst();
		//ls.deleteLastNode();
		//ls.addNodeStart(6);
		//ls.insertAnyLocatio(0, 55);
		//ls.deleteAt(2);
		
	
		
		
	}

}
