package practiceprogram;

public class Constuctor {
	
	int a;
	int b;
	int c;
	
	public Constuctor(int a, int b, int c) {
		this.a= a;
		System.out.println(a+b+c);
	}
	public Constuctor() {
		this(10,20,60);
		System.out.println("Cont 2");
	}
	
	
     public static void main(String[] args ) {
    	 Constuctor obj   =   new Constuctor();
    	 System.out.println(obj.a);
    	
     }
}
