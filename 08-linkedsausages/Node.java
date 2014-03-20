/*
FUNNY BUSINESS
Andrew -> Amnopreet -> Florence -> Peter -> Emma -> Omardo
items stored in array/lists
gwobs of dwata

LINKED LISTS - flexible
cycles/inserts/interesting structure
dominos theory
nodes

*/
public class Node{

    private String data;
    private Node next;
    
    public Node(String d){
	data = d;
	next = null;
    }

    public void setData(String d){
	data = d;
    }

    public String getData(){
	return data;
    }

    public void setNext(Node n){
	next = n;
    }

    public Node getNext(){
	return next;
    }

    public String toString(){
	return data;
    }

} 