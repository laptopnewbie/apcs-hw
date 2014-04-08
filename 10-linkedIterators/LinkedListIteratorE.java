import java.io.*;
import java.util.*;
public class LinkedListIteratorE<E> implements iterable{
    private Node<E> head;
    private Node<E> tail;
    
    public LinkedListIteratorE(){
	head = null;
	tail = null;
    }
    public LinkedListIterator iterator(){
	E n = head.getData();
	return new LinkedListIterator(n);
    }

    public void add(E s){
	Node<E> temp = new Node<E>(s);
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
	Node temp<E> = head;
        for (int j=0; j<i-1; j++){
	    temp = temp.getNext();
	}
	Node<E> nod = new Node<E>(s);
	nod.setNext(temp.getNext());
	temp.setNext(nod);
	if (temp == tail){
	    tail = nod;
	}
    }
    
    public E get(int i){
	Node<E> temp = head;
	for(int j=0;j<i;j++){
	    temp = temp.getNext();
	}
	return temp.getData();
    }

    public E set(int i, E s){
	Node<E> temp = head;
	for (int j=0;j<i;j++){
	    temp = temp.getNext();
	}
	E res= temp.getData();
	temp.setData(s);
	return res;
    }

    public E remove(int i){
	Node<E> temp = head;
	for (int j=0;j<i-1;j++){
	    temp = temp.getNext();
	}
	E re= temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	return re;
    }
    public int find(E s){
	Node<E> temp = head;
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
	Node<E> temp = head;
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