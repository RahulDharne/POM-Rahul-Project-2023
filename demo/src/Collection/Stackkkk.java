package Collection;

import java.util.Iterator;
import java.util.Stack;

public class Stackkkk {

	
	public static void main(String[] args ) {
		       Stack<String> stack    =  new Stack<String>();
		            stack.push("Mango");
		            stack.push("Grapes");
		            stack.push("apple");
		            stack.push("Mango");
		            stack.push("chiko");
		            stack.push("bit");
		        stack.pop();   
		             Iterator<String> loop = stack.iterator();
		             while(loop.hasNext()) {         // til next elemt it wil run
		             System.out.println(loop.next());
	                         		
		            
	}
}
}