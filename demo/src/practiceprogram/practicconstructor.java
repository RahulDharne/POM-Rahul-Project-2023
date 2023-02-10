package practiceprogram;

public class practicconstructor {
	
	int a;
	int b;
	int c;
	
	
	public void m1(int a, int b, int c) {
		this.a=a;
		System.out.println(a+b+c);
	}
		
	public static void main(String[] args ) {
		practicconstructor obj  = new practicconstructor();
		obj.m1(10,20,60);
		System.out.println(obj.a);
	}

}
