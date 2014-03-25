public class MyLinkedList2{
    
    private Node head;
    private int length;
    
    public MyLinkedList2(){
	head = new Node("0");
	length = 0;
    }

    public int length(){
	return length;
    }
    
    /*public void add(String s){
	Node temp = new Node(s);
        temp.setNext(head);
	head = temp;
	length++;
    }*/

    public void tadd(String s){
	Node tail = head;
	if (length == 1){
	    head.setNext(new Node(s));
	    length++;
	}
	else{
	    Node temp = head;
	    System.out.print(head);
	    tail = head.getNext();	    
	    for(int i = 0; i < length; i++){
		temp.getNext();
		tail.getNext();
	    }
	    //tail.setNext(new Node(s));
	    length++;
	}
    }

    public String toString(){
	String s = "";
	//s =" "+ head;
	//need loop
	Node temp = head; 
	while(temp!=null){
	    s += temp +" ";	  
	    temp = temp.getNext();
	  
	}
	return s;
    }

    public void add(String s, int i){
	Node temp = head;
	for (int a = 0; a<i; a++){
	    temp=temp.getNext();
	    if (a==i-1){
		temp.setNext(new Node(s));
	    }
	}
    }
		
    /*
    String toString()
    void add(int i, String s) // adds s at location i, exception if you try to add past the end.
    string get(int i) // return the string at location i, exception if i is past the end.
    String set(int i, String s) // changes the value at location i to s. Returns the old value. Exception if I is off the end.
    String remove(int i) // remove and return the String at i, exception on error.
    String find(int i) // return the String at location i. Exception on error.
    int length() // return sthe number of elements in the list.
    */
   
}

/*
March 24, 2014
1. Modify MyLinkedList so that the add routine so that it adds to the end
2. Copy to 09-PIII and add a tail pointer

PEER PROGRAMMING!!
 */
