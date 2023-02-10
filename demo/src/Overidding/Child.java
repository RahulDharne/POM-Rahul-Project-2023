package Overidding;

public class Child extends parent{
	 
	   int a = 20;
	   int b = 100;
	    void methods() {
		  System.out.println("it is child class");
		
	}
	    public static void main(String[] args ) {
	    	//Child obj     =  new Child();
	    	//  obj.methods();
	    	
	    	parent obj1 = new Child();// overridding methods
	    	obj1.methods();
	    	System.out.println(obj1.a);
	    	System.out.println(obj1.b);
	    }
   
	    
}
