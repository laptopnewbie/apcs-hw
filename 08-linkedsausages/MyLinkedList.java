//were we supposed to use the try/catch? Ans: Nope
//constructor = new Node("Empty"); -> remove index shift 1

public class MyLinkedList{
    
    private Node head;
    private int size;
    
    public MyLinkedList(){
	head = null;
	size = 0;
    }

    public int size(){
	return size;
    }
    //Method 1 - make loop with toString() to calculate length then return it
    //O(n)

    //Method 2 - make length instance variable, maintain add/remove routines to modify length
    //O(amortizated) aka situational
    //linear work but bits of work spread out

    /*
      AMORTIZATION
      ex1. walking - free
           citi bike - $10 a day, $100 a year - actual cost per use depends on number of uses
           subway - $5 a day
      
      ex2. kitchen aid - $309 last 25 years
      
     */
    
    public void add(String s){
	Node temp = new Node(s);
        temp.setNext(head);
	head = temp;
	size++;
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
		size++;
	    }
	}
    }
		
    public String get(int i){
	if (size<i){
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
	if (size<i){
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

    /*REMOVE OL' MINE
      public String remove(int i){
	if (size<i){
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
		    size--;
		}
	    }
	}
	return holder.getData();
	}*/

    // with empty first head
    public String remove(int n){
	int i = 0;
	Node temp = head.getNext();
	Node temp2 = head; //piggyback pointer that follows temp
	while (i<n){
	    temp2 = temp; //temp2 one before event point
	    temp = temp.getNext(); //temp eventually becomes event point
	    i++;
	}
	temp2.setNext(temp.getNext());//or temp2.setNext(temp2.getNext().getNext());
    }
    //***piggybacking pointersLOL! - trail pointer by other pointer

 
    public String find(int i){
	if (size<i){
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
   



// cake pops in ice in der summah
// CIRCWULAR LINKED WIST?!