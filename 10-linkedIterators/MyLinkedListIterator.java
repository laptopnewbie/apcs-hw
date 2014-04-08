import java.io.*;
import java.util.*;
public class MyLinkedListIterator<E> implements Iterator<E>{
    //   private Node<E> head;
    private Node<E> currentNode;
    
    public MyLinkedListIterator(Node<E> n){
	currentNode = n;
    }

    //public iterator<E>(){
    //	return new MyLinkedListIterator();
    //}

    public boolean hasNext(){
	return currentNode!=null;
    }
    
    public E next(){
	E data = currentNode.getData();
	currentNode = currentNode.getNext();
	return data;
    }

    //public void remove(){
    //}
    // easier with dummy node
  
    //test with
    MyLinkedListIterator<String> de = new MyLinkedListIterator<String>();
    de.add("rae");
    de.add("arfa");
    de.add("ena");
    Iterator<String> it = L.iterator();
    while (it.hasNext()){
	System.out.println(it.next());
    }
    System.out.println();
    for (String s : L){
	System.out.println(s);
    }

    /*
      using iterators for LinkedLists are faster cuzza derpa current node

     */

}