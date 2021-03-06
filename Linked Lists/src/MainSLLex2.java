public class MainSLLex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLLex2 sll = new SLLex2();//create the object
        System.out.println("=== Empty SLL ===");
        System.out.println("Size = "+ sll.getSize());//getter method
        System.out.println("Empty = " + sll.isEmpty());
        System.out.println();
                
        //add elements
        sll.addLast(11);
        sll.addLast(22);
        sll.addLast(11);
        System.out.println("=== After adding elements ===");
        System.out.println("Size = "+ sll.getSize());
        System.out.println("Empty = " + sll.isEmpty());
        System.out.println("Element 0 = " + sll.get(0));
        System.out.println("Element 1 = " + sll.get(1));
        System.out.println("Element 2 = " + sll.get(2));
        System.out.println();
        
        //clear
        sll.clear();
        System.out.println("=== After clearing elements ===");
        System.out.println("Size = "+ sll.getSize());
        System.out.println("Empty = " + sll.isEmpty());

	}

}
