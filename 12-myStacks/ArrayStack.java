//with Kevin Kan y 4-man group
import java.io.*;
import java.util.*;

public class ArrayStack{
    private String[] stack;
    private int numElements;

    public ArrayStack(){
	stack = new String[5];
	numElements = 0;
    }
    public void push(String s){
	if (numElements < stack.length){
	    stack[numElements] = s;
	    numElements++;
	}else{
	    String[] temp = new String[stack.length*2];
	    for (int a = 0; a<numElements; a++){
		temp[a] = stack[a];
	    }
	    stack = temp;
	    push(s);
	}

    }
    public String pop(){
	String temp = stack[numElements - 1];
	stack[numElements] = null;
	numElements--;
	return temp;
    }
    public String peek(){
	return stack[numElements];
    }
    public boolean isEmpty(){
	return numElements == 0;
    }
    public String toString(){
	String ret = "";
	for (int i = 0; i< size(); i++){
	    ret = ret + stack[i] + " ";
	}
	return ret;
    }
    public int size(){
	return numElements;
    }

    public static void main(String[] args){
	ArrayStack a = new ArrayStack();
	a.push("1Hello");
	a.push("2World!");
	a.push("3Hello");
	a.push("4World!");
	a.push("5Hello");
	a.push("6World!");
	a.push("7Hello");
	a.push("8World!");

	System.out.println(a.size());
	System.out.println(a.pop());
	System.out.println(a.pop());
	System.out.println(a.size());
	System.out.println(a);



    }

}
