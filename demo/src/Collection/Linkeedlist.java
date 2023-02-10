package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Linkeedlist {
	
	   public static void main(String[] args ) {
		   Vector<String>  vec = new Vector<String>(); 
		        vec.add("Mango");
		      vec.add("grapes");
		      vec.add("jack fruits");
		        vec.add("Mango");

		    Iterator <String>  loops    =  vec.iterator();        // we need to use String 
		      while(loops.hasNext()) {
		  System.out.println(loops.next());


		  }
		  }
}		         