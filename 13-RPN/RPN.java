public class RPN{
    private MyStack stack;
    
    public RPN(){
	MyStack temp = new Mystack();
	stack = temp;
    }

    public void calc(String s){
	if (s.length() > 2){
	    for (int a = 0; a < s.length(); a++){
		char letter = s.charAt(a);
		if (letter.isDigit()){
		    stack.push(letter.getNumericValue());
		}else if(letter!='+'&&letter!='-'&&letter!='/'&&letter!='*'){
		    System.out.println("Calculator, not time machine.");
		}else{
		    String first = stack.pop();
		    String second = stack.pop();
		    if (letter=='+'){
			stack.push(first+second);
		    }else if (letter=='-'){
			stack.push(first-second);
		    }else if (letter=='/'){
			stack.push((double)first/(double)second);
		    }else{
			stack.push((double)first*(double)second);
		    }
		}
	    }
	}
    }
}

    
