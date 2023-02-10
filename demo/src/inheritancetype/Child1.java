package inheritancetype;

public class Child1 extends Parent {
	
	static int a = 100;
	int b = 200;
	
	public void m2()  {
		System.out.println("child1 is method"); 
	}
     public void method() {
    	 // System.out.println(b);
    	  System.out.println(super.b);
     }
	
	
	public static void main(String[] args ) {
		Child1 obj   = new Child1();
		obj.m1();
		obj.m2();
		System.out.println(a);   // static variables
	   System.out.println(obj.b);  // non static variables from parents
		obj.method();
		System.out.println(Parent.a);  //classname.variablename
		
	
	}

}
