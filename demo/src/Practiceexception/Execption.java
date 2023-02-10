package Practiceexception;

public class Execption {
	
	public static void main(String[] args ) throws InterruptedException {
		
		    System.out.println(1);
		    System.out.println(2);
		    System.out.println(3);
		    try {
		         System.out.println(4*2);   // exception occur during run time
		    
		    }
		   catch(ArithmeticException refvar ) {
			   System.out.println("4 didvide by 2");
		   }
				 finally 
				 {
				   System.out.println("it wil print anyhow");
				 } 
		    	
		    
		    System.out.println(5); 
		    Thread.sleep(5000);
		    System.out.println(6);
		    
	}

}
	

