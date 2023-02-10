package practicesvariables;

import java.util.HashMap;
import java.util.Set;

public class DuplicateString {
	
	public static void main(String[] args ) {
		   String a = "aaaabbbvchduois";  // only duplicate number will print
		    char [] ar =   a. toCharArray();
		  
		   HashMap <Character,Integer>  mapp    = new HashMap <Character,Integer>();  // chacter as key , int as value
		   
		       for(char var:ar)   {          // ar = wil reprnt entire arrys set      , b = var                    // first key , and last value
              if(mapp.containsKey(var))  // it wil see it is dupicate or not it wil check futher it send
            	     
            	  mapp.put(var, mapp.get(var)+1); // to get value we use getmethods
            	  
            	   else
            		  mapp.put(var, 1);
		         
	}
		     Set<Character> keys  = mapp.keySet();
		     for(char key:keys) {
		    	 if(mapp.get(key)>1)
		      System.out.println(key+":"+mapp.get(key));
	}
	}
}
