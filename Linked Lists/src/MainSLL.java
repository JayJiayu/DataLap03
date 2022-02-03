public class MainSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    SLL sll = new SLL(); // create an object the SLL class
	    sll.addFirst(2);
	    sll.addLast(3);
	    sll.addFirst(1);
	    sll.print();
	    sll.removeFirst();
	    sll.print();
	    sll.removeLast();
	    sll.print();
	}
}
