package Exception;

public class Test1 {

	public static void main(String[] args ) {
		       System.out.println(1);
		       System.out.println(2);
		       System.out.println(3);
		       try
		       {
		    	   System.out.println(100/0);
		       }
		    	catch(ArithmeticException refvar) {
		    		System.out.println("cannot be divided by zero");
		    	}
		       
		       System.out.println(4);
		       System.out.println(5);
		       System.out.println(6);
	}
}
