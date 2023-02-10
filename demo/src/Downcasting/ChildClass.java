package Downcasting;

public class ChildClass extends  downcasting {

	   void childMethodsExample() {
		   System.out.println("inside child");
	   }

      public static void main(String[] args ) {
	                                            //downcasting obj   = new 	downcasting();  
	                                         //  obj.parentMethodExample();

	                                                       //  ChildClass obj    =  new ChildClass();  
	   downcasting obj =  new ChildClass();   //   
	   //   ((ChildClass) obj).childMethodsExample(); //  f downcasting   we are taking casting in parent class object in child class
	    //  obj.m1();
	        ChildClass obj1=   (ChildClass)obj ;  
	            obj1.m1();
	          obj1. parentMethodExample();
	        obj1.childMethodsExample();
   }
}           