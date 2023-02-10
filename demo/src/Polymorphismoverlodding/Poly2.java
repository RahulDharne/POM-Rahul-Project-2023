package Polymorphismoverlodding;

public class Poly2 extends  Poly1 {
	
	public void t1(boolean c, int d) {
		System.out.println("t1 child method overloading");
	}
	
    public static void main(String[] args ) {
    	 Poly1 obj1   = new Poly2(); 
    	 obj1.t1(); //  jiska refrence uska methdo chelega 
    	obj1.t1(77);
    	
    	
    	
    }
    	
}
