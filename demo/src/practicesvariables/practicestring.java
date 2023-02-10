package practicesvariables;

import java.util.HashMap;
import java.util.Set;

public class practicestring {

	 public static void main(String[] args ) {
		     
		           String a = "hsdhhsggdsdggttdduu";
		           
		           char [] ar = a.toCharArray();
		           
		           HashMap<Character,Integer> mapp = new HashMap <Character,Integer>();
		                  
		           for(char var : ar) {
		           if(mapp.containsKey(var))
		           
		              mapp.put(var, mapp.get(var)+1);
		           else
		        	   mapp.put(var, 1);
	 }
	           Set<Character> keys  = mapp.keySet(); 
	             for(char key : keys)
	             if(mapp.get(key)>1)
	            System.out.println(key+":"+ mapp.get(key));
	            	 
	                
		           
	 }


}
