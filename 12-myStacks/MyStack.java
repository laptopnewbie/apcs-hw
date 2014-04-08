public class MyStack{
    private String[] stack;
    private int height;
    
    public MyStack(){
	stack = new String[10];
	height = 0;
    }

    public void push(String s){
	if (numStacks < stack.length){
	    index++;
	    stack[index] = s;
	}else{
	    stack = Arrays.copyOf(stack,stack.length*2);
	    push(s);
	}
    }
    
    public String pop(){
	if (height != 0){
	    String temp = stack[height-1];
	    stack[height-1] = null;
	    height--;
	    return temp;
	}
    }

    public String peek(){
	return stack[height];
    }

    public boolean isEmpty(){
	return height==0;
    }
 
    public String toString(){
	if (isEmpty()){
	    return "Bummer";
	}else{
	    String res = "";
	    for (int a = 0; a < height; a++){
		res += stack[a] + " ";
	    }
	    return res;
	}
    }
}
