package Collection;

import java.util.ArrayList;

public class ArraysList {

	 public static void main(String[] args ) {
		 ArrayList<String> list  = new ArrayList<String>();
		 
		    list.add("Mango");     //it will allow duplicate null 
		    list.add(null);
		    list.add(null);    // it will allow dupilcate
		    list.add(" ");
		    list.add("Mango");
		    list.add(" ");
		    list.add("Grapes");
		    
		    for(String a : list)
		    	System.out.println(a);
		    
		 
	 }
}
