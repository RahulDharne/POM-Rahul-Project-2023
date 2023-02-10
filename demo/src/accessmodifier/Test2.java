package accessmodifier;

public class Test2  extends Test1  {
	
	public void m1() {
		System.out.println("m1 from child class");
	}

	public static void main(String[] args ) {
		Test2 obj   = new Test2();
		  obj.m1();
		  obj.m2();
		  Test1.m3();
		  System.out.println(obj.a);  //20
		  obj.a =200;
		  System.out.println(obj.a);  //200
		 
	
	}
	
		
}
