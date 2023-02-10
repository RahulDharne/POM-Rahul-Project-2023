package Exception;

public class example3 {
	
	public static void main(String[] args ) {
     System.out.println(1);
		 	System.out.println(2);
	 		System.out.println(3);
	 		try
		     		{
		      		System.out.println(4/0);
		     		}
	           catch(ArithmeticException refvar) {        // catch run only when exception come
	        	   System.out.println("zero cannot divide");
	           }
		      		catch(NullPointerException ref) {   // only related exception catch will run  first 
		      			System.out.println("null pointer occured");
		      		}
		      		finally
		      		{
		      	System.out.println("non matter it wil run");      // finally will run always  but not mandatory always only secure only
	        	   System.out.println(4);
	        	   System.out.println(5);
	        	   System.out.println(6);
	           }
		      		}
}
