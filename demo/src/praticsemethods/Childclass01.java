package praticsemethods;

public class Childclass01 extends ParentClass01 {
	
	int a= 30;
	static int b = 40;
	
	
         Childclass01() {
		System.out.println("inside child class constructor");//  alwya run parent class constructor and its is overridding also becaue same data
	}
	
	 void methodsExample() {
		 System.out.println("indside child class instance method");
		
	}
	
	 static void staticmethodExample() {
		 System.out.println(" static class inside method");
		 
	 }
	    public static void main(String[] args ) {
	    	ParentClass01 obj      = new ParentClass01();
		         System.out.println(obj.a);
		         System.out.println(obj.b);
		         obj.methodsExample();
		          obj.staticmethodsExample();
	 System.out.println(" ");
	    // upcasting procsess
	    ParentClass01 obj1 =  new Childclass01();  // it will response to refrence oject expect overiding method it wil response to object
	      System.out.println(obj1.a);
	      System.out.println(obj1.b);
	      obj1.methodsExample();  //  method get overide in object 
	      obj1.staticmethodsExample();
	           
	    }
}
