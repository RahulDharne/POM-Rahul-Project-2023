package Exception;

public class example2 {
	
	   public static void main(String[] args ) {
		   System.out.println(1);
		  try
		   {
		   int a = 100 , b = 0, c;
		   c = a/b;
		   System.out.println(c);
		  
		  }
		  catch(ArithmeticException ref) {
			  System.out.println("cannot divde by zero");
			  System.out.println(2);
			  System.out.println(3);
		  }
		  System.out.println(4);
		   System.out.println("excute");
		   
	   }

}
