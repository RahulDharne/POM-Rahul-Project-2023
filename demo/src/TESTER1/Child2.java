package TESTER1;

public class Child2 extends  Parent2 {
	
	public void t1(boolean c , int d) {
		System.out.println("t1 is child method");
		
	}
	          public static void main(String[] args ) {
	       //   Child2 obj  =  new Child2();
	        	   //   obj.t1();
	        	    //  obj.t1(95);
	        	    //   obj.t1(false, 55);
	          
	          
	       //  Parent2  obj1  =  new Parent2();
	           //    obj1.t1();
	          //      obj1.t1(95);
	                
	                 Parent2 obj2 = new Child2();
	                        obj2.t1();
	                         obj2.t1(95);
	                
	                       	          
	          }
	

}
