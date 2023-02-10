package Casting;

public class Child extends Parent{
	
	              void m2() {                                             // byte a = 10;
	            	                                                       // int b = (int) a; 
		System.out.println("inside child");
	}
		public static void main(String[] args ) {
	// Parent obj    = new Parent();       // IT CAN REFER ONLY PARENT CLASS
	  //obj.m1();
			     
			    Child obj1= new Child();
			     obj1.m2()   ;            // it can reference to child class 
			     
	 //Child obj1  =  new Child();  // obj1 is belong to child class
	      // Parent obj  = obj1 Child();     // whenever  child class obj is type cast into parent class is upcasting  
			Parent obj =  (Parent)obj1;         // byte a = 10; it type child class refre to type to parent class
          //                                                    // int b = (int) a; 
			   obj.m1();
			   obj1.m2();
			   obj.methods();
			   
			 
		}
		
	}


