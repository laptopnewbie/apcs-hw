//were we supposed to use the try/catch?
public class MyLinkedList{
    
    private Node head;
    private int length;
    
    public MyLinkedList(){
	head = null;
	length = 0;
    }

    public int length(){
	return length;
    }
    
    public void add(String s){
	Node temp = new Node(s);
        temp.setNext(head);
	head = temp;
	length++;
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
    //should work but dun
    public void add(String s, int i){
	Node temp = head;
	for (int a = 0; a<i; a++){
	    temp=temp.getNext();
	    if (a==i-1){
		temp.setNext(new Node(s));
		length++;
	    }
	}
    }
		
    public String get(int i){
	if (length<i){
	    return "Index out of range";
	}
	Node temp = head;
	for (int a = 0; a<i; a++){
	    temp = temp.getNext();
	    if (a+1==i){
		return temp.getData();
	    }
	}
	return temp.getData();
    }

    public String set(String s, int i){
	if (length<i){
	    return "Index out of range";
	}
	Node temp = head;
	for (int a = 0; a < i;a++){
	    temp = temp.getNext();
	    if (a+1==i){
		Node temptemp = temp;
		temp.setNext(new Node(s));
		return temptemp.getData();
	    }	    
	}
	return "If end";
    }

    public String remove(int i){
	if (length<i){
	    return "Index out of range";
	}
	Node holder = head;
	Node temp = head;
	for (int a =0; a<i;a++){
	    temp = temp.getNext();
	    if (a+1==i){
		holder = temp;
		for (int b=i;b<length;b++){
		    temp.setNext(temp.getNext());
		    length--;
		}
	    }
	}
	return holder.getData();
    }
 
    public String find(int i){
	if (length<i){
	    return "Index out of range";
	}
	Node holder = head;
	Node temp = head;
	for (int a=0;a<length;a++){
	    temp = temp.getNext();
	    if (a==i-1){
		holder = temp;
	    }
	}
	return holder.getData();
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
   



