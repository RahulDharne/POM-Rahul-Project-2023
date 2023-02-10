package inheritance;

public class child extends parent {

	public void m3() {
		System.out.println("non static method of child class");
	}
	
    public static void main(String[] args ) {
    	m1();
    	  child obj  = new child();
    	  obj.m2();
    	  obj.m3();
    	
    }
}