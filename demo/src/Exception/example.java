package Exception;

public class example {

	   public static void main(String[] args ) {
		   try
		   {
		    int a = 100, b = 0, c;
				  c = a/b;
		   System.out.println(c);
		   }
		   catch(ArithmeticException ref1) {
			   System.out.println("can not divided by zero");
		   }
		   System.out.println("has run ");
		   
	   }
	   
		   
			 
		   
	   
}
