public class NodeTester{
    public static void main(String[]args){
	Node nose1 = new Node("Sullen"); //
	Node nose2 = new Node("Dick");
	System.out.println(nose1);
	System.out.println(nose2);

	nose1.setNext(nose2);
	System.out.println(nose1.getNext());
	nose1.getNext().setNext(new Node("Randy"));
	System.out.println();
	System.out.println(nose2.getNext());
	System.out.println(nose1.getNext().getNext());
	/*
	nose1.setNext(nose1.getNext().getNext());
	System.out.println("Get rid of dat noob");
	System.out.println(nose1);
	System.out.println(nose1.getNext());
	System.out.println(nose1.getNext().getNext());
	*/
	nose1.getNext().setNext(nose1);
	System.out.println(nose1);
	System.out.println(nose1.getNext());
	System.out.println(nose1).getNext();
	System.out.println(nose1).getNext().getNext();
	

	
    }
}			     