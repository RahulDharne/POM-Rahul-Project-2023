package inheritance;

public class Child2  {
	
	public void m3() {
		System.out.println("non static method of child class");
	}
	
	
	public static void main(String[] args ) {
		parent.m1();
		parent obj = new parent();
		obj.m2();
		
		Child2 obj1  = new Child2();
		obj1.m3();
	}

}
