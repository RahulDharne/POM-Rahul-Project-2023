package READY;

public class Child1 extends parent {
	       
	public void m3() {
		System.out.println("m3 is non static method");
		
	}
	public static void k1() {
		System.out.println("k1 is methdo");
		
	}
	
	public static void main(String[] args )  {
		Child1 obj     = new Child1();
		      obj.m1();
		      obj.m2();
		      obj.m3();
		      k1();
		      System.out.println(obj.a);
		      System.out.println(b);
		       System.out.println(c);
	}
	
	
	
	
	
	
	
	

}
