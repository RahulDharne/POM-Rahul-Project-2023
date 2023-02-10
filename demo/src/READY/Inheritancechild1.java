package READY;

public class Inheritancechild1 extends Inheritanceparent1 {
	
	static int a =100;
	int b = 200;
	
	   public void k1() {
		   System.out.println("k1 is a child");
	   }   
		   public void engineer() {
			   System.out.println(b);
			   System.out.println(super.b);
    }
		public static void main(String[] args ) {
			Inheritancechild1 obj     =  new Inheritancechild1();
			     obj.m1();
			     obj.m2();
			     obj.k1();
			     obj.engineer();
		       m3();
		       System.out.println(a);
		        System.out.println(Inheritanceparent1.a);
		
		
		
	}
	        	        
	        	      
	           
	           

}
