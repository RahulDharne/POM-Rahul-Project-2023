package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	
	     public static void main(String[] args ) {
	    	    ArrayList<String> list  = new ArrayList<String>();    // arrays list maintain insertion order
	    	    
	    	    list.add("Mango");
	    	    list.add("apple");
	    	    list.add("Jack fruit");
	    	    list.add("Mango");
	    	    
	    	     Iterator loops   = list.iterator();
	    	     
	    	     while(loops.hasNext())  {
	    	    	System.out.println(loops.next());
	    	     }
	     }
	     
}
