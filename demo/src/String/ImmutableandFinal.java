package String;

public class ImmutableandFinal {
            
	  public static void main(String[] args ) {
		  
		   String a = "Rahul";
		   
	//  System.out.println(a);    //  if we created object at once we cannot change value but a wil strat pointing newly created object 
		                                 // string is by default final refrence strat ponting new object later on that old object get garbage
		                                    // collected
		   
		    a = "Automation";   
		 
		    // it will print automation
		   
		    System.out.println(a);
	  }
}
