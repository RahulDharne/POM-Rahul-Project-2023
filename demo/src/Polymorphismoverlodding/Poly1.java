package Polymorphismoverlodding;

public class Poly1 {
	
	public void t1() {
		System.out.println("t1 is a overloadding method");
	}
	
	public void t1(int a ) {
		System.out.println("t1 with arguments from parent");    //  in same class
	}
           public static void main(String[] args ) {
        	   Poly1 obj    = new Poly1(); 
        	   obj.t1();
        	   obj.t1(77);                                
 }
	
                                                        
}
