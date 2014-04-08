import java.io.*;
import java.util.*;
public class MyLinkedList3{
    private Node head;
    private Node tail;
    
    public MyLinkedList3(){
	head = null;
	tail = null;
    }

    public void add(String s){
	Node temp = new Node(s);
	if (head == null){
	    temp.setNext(tail);
	    head = temp;
	}
	if (head.getNext() == null){
	    head.setNext(temp);
	    tail = temp;
	}
        else{
	    tail.setNext(temp);
	    tail = temp;
	}
    }

    public void tadd(int i, String s){
	Node temp = head;
        for (int j=0; j<i-1; j++){
	    temp = temp.getNext();
	}
	Node nod = new Node(s);
	nod.setNext(temp.getNext());
	temp.setNext(nod);
	if (temp == tail){
	    tail = nod;
	}
    }
    
    public String get(int i){
	Node temp = head;
	for(int j=0;j<i;j++){
	    temp = temp.getNext();
	}
	return temp.getData();
    }

    public String set(int i, String s){
	Node temp = head;
	for (int j=0;j<i;j++){
	    temp = temp.getNext();
	}
	String res= temp.getData();
	temp.setData(s);
	return res;
    }

    public String remove(int i){
	Node temp = head;
	for (int j=0;j<i-1;j++){
	    temp = temp.getNext();
	}
	String re= temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	return re;
    }
    public int find(String s){
	Node temp = head;
	int index = 0;
	while (temp != null){
	    if (temp.getData().equals(s)){
		return index;
	    }
	    temp = temp.getNext();
	    index++;
	}
	return -1;
    }

    public int size(){
	int num;
	Node temp = head;
	num = 0;
	while (temp != null){
	    temp = temp.getNext();
	    num++;
	}
	return num;
    }

    public String toString(){
	String s = "";
        Node temp = head;
	while (temp!=null){
	    s += temp + " ";
	    temp = temp.getNext();
	}
	return s;
    }
}
