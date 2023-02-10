package polymorphism;

public class Poly2 extends Poly1 {
	
	public void m1() {
		System.out.println("m1 is in child"); //m1 is overridded method both class are m1 present
		
	}
	    public static void main(String[] args ) {
	    	 Poly1 obj = new  Poly2();  
	    	 obj.m1();        // in over ridding jiska object a uska method chelga
	    }

}
