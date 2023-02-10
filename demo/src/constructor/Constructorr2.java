package constructor;

public class Constructorr2 {
	
	
	int a;
	int b;
	int c;
	
	
	public Constructorr2(int a , int b, int c)  {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public static void main(String[] args ) {
		Constructorr2 obj   = new Constructorr2(550,30, 40);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}

}
