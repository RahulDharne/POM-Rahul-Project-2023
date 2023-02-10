package Collection;

import java.util.HashSet;

public class Settt {
	
	  public static void main(String[] args ) {
		  HashSet<String>  Set  = new HashSet<String>();
		     
		         Set.add("Mango");     // insertion order can be vary
		         Set.add("Jackfruit");
		         Set.add("grapes");   // in hash no duplicate value will allow
		         Set.add("Chiko");
		         Set.add("Apple");
		         Set.add("Jackfruit");
		         Set.add("Mango");
		         Set.add("");
		         
		         for(String a: Set)
		        	 System.out.println(a);
		         
	  }

}
