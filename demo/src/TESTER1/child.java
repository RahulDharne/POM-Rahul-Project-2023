package TESTER1;

public class child extends Parent {
	
	   public void login(String Username,String Password,String Colour) {
		   System.out.println("login checking with  loging button");
	   }
	   
	   public static void main(String[] args ) {
		   //  child obj  = new child();
		     //   obj.login("rahul","rahul12","orange");
		        
		    //	Parent obj1      = new Parent();
				//   obj1. login();
				//   obj1.login("rahul","rahul12");
			
	   
	            Parent obj2  = new child();
	           obj2.login("rahul","rahul12");
	           obj2.login();

	   }
}  
		     
		     
		     
		          
	   
	
	   
	
	    		
	
	


