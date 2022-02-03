public class SLLex3 {
	private class Node {
		private int element;//data
		private Node next;//pointer

		// constructor
		public Node(int data) {
			element = data;
			next = null;
		}

		// link a new node to this node
		public void link(Node newNode) {
			next = newNode;
		}

		// return next node
		public Node getNextNode() {
			return next;
		}

		// return element of this node
		public int getElement() {
			return element;//data
		}
	}
	// --------------------- End Node --------------------

	// SLL properties and methods
	private Node head = null;//pointer
	private Node tail = null;//pointer
	private int size = 0; // count the SLL's size

	public void addLast(int data) {//create newNode and add to the end
		// create new node
		Node newNode = new Node(data);//get a node 
		//check the liked list for the other nodes
		if (size == 0) {// when the node is empty 
			head = newNode;
			//tail = newNode;
			//size++;
		} else {// when there are some nodes in the linked list 
			tail.link(newNode);
			//tail = newNode;
			//size++;
		}
		tail = newNode;
		size++;
	}

	public void addFirst(int data) {
		//create the new Node
		Node newNode = new Node(data);
		//check the liked list
		if(size == 0) {//to check the link list for empty
			//head = newNode;//point to newNode
			tail = newNode;
			//size++;//increase the size
		}else {
			newNode.link(head);//connect the newNode to the font of the linked list
			//head = newNode;//move head to newNode
			//size++;
		}
		head = newNode;//move head to newNode
		size++;
	}
	public void removeFirst() {
/*		if(size ==0) {
			//do nothing
		}*/
		if(size == 1) {// 2nd case of 1 node in the linked list
			head = null;
			tail = null;
			//size--;
		}else if(size > 1){// 3nd case of many nodes in the linked list
			head = head.getNextNode();//move head to the next node
			//size--;
		}
		size--;
	}

	public void removeLast() {
		if(size == 1) {// 2nd case of 1 node in the linked list
			head = null;
			tail = null;
			size--;
		}
		else if(size > 1){// 3rd case 
			// create the p pointer 
			Node p = head;// p as the object of the node class --> pointer
			// LOOP to move p 
			// while do while
			while(p.getNextNode()!=tail) {//check that p is not the node before the last node 
				p = p.getNextNode();// move p to the right of the linked list
			}
			tail = p;// move tail to the node before the last node
			tail.link(null);//disconnect the last node
			size--;
		}
	}

	public void print() {
		if (size == 0) {
			System.out.println("Empty linked list");
		} else {
			for (Node p = head; p != null; p = p.getNextNode()) {
				System.out.print(p.getElement() + "->");
			}
			System.out.println("null");
		}
	}
	public boolean findElement(int index) {//to find whether a number is in a SLL and return true or false when found and not found respectively		
		boolean a ;
		Node p = head;
		for(int i =0;i<p.getElement();i++) {
		if(index == p.getElement()) {
		return true;			
		}
		p = p.getNextNode();
		if(index != p.getElement()) {
		return false;
		}						
		}
		return false;
	}

	public int countElement(int index) {//to count nodes whose elements are equal to a number
		int sum =0;		
		//head = head.getNextNode();
		if(head.getElement()==index) {
			sum++;
			head=head.getNextNode();
		if(tail.getElement()==index) {
			sum++;
		}
			}
				
		return sum;
	}
	public int sumElement() {//to find summation of all numeric elements of nodes
		int a = head.getElement()+tail.getElement();
		//head=head.getNextNode();
		int b = head.getElement()+tail.getElement();
		int sum = a+b;
		
		return sum;
	}

}

