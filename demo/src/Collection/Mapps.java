package Collection;

import java.util.HashMap;
import java.util.Set;

public class Mapps {

	  public static void main(String[] args ) {
		    HashMap<Integer,String>  mapping   = new HashMap<Integer,String>();
		      
		       mapping.put(11, "Rahul");
		       mapping.put(12, "Raju");                   //value shoud be in string
		       mapping.put(13, "Rohit");
		       mapping.put(14, " ");
		       mapping.put(15, "gill");
		       mapping.put(16,"axar");               
		       mapping.put(17, null);
		       mapping.put(18, "Siraj");
		      // mapping.put(18, "umesh");
		        // key cannot be duplicate
		       
		      Set<Integer> keys =  mapping.keySet();   // key cannot be duplicat we use setinterface becaue it dones not allow duplicate value
		       for(int key : keys)                         // key is nothing but Setintegervalue
		  System.out.println(key+ " " + mapping.get(key));  // cll by get methods
	  }                                                                       
	
	
}
                                                                                  // duplicate value is allow duplicate key is not allow 