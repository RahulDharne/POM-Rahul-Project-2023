package argumentsandreturntypes;

public class WithoutArgAndWithoutReturns {
	
	 // without argument and without return type
			 
	public void  m1() {
	     System.out.println("without argument and without return type ") ;  
	     
	    }
	
	public static void m2() { 
		System.out.println("without argument and without return type");
		
	}

	public static void main(String[] args) {
		WithoutArgAndWithoutReturns obj   = new WithoutArgAndWithoutReturns();
		 obj.m1();
		 m2();
	}
}
