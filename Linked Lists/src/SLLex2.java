public class SLLex2 {
	// ----------------------- Node --------------------
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
	        /*if(size ==0) {
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
		//add MORE method , here
		
		public int getSize() {
			//GETTER method --> return  size of SLL			
			return size;
		}
		public boolean isEmpty() {
			if(size==0) {//check the linked list is empty, or not ?
				return true;
			}else {
				return false ;
			}
			//if SLL is empty
		}
		public int get(int index) {//return element at specified position
			int value = -999;//negative number --> confirm the missed finding of target node
			//check the linked list is NOT empty
			if(size > 0 && index < size) {//check it is not empty AND make sure the position is not over amount of nodes in the linked list
				Node p = head ;
				//LOOP to move p for 'index' times
				for(int i =0;i<index;i++) {
					p = p.getNextNode();// to move p 
				}
				value = p.getElement();//copy the value/data of node p				
			}else {//index > size
				System.out.println("Error, index is out of bound!");
			}
			 return value; // Integer
		}
		 public void clear() {// remove all elements FROM the linked list
			 head = null ;
			 tail = null;
			 size = 0;			 
		 }
}
