package Downcasting;

public class Childclass1 extends  Prentclass1 {
	
	  public void m2() {
		  System.out.println("inside childclass instance method");
		  
	  }

	   public static void main(String[] args ) {
		  // Prentclass1 obj  = new Prentclass1();
		            //   obj.m1();
		            //  obj.m2(); // thse not possible
		   Prentclass1 obj    = new Childclass1();
		    (( Childclass1) obj).m2();         // down casting
	   }
}
