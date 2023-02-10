package PracticingPrograme;

public class Cons2 extends Cons1 {
	
	public void t1() {
		System.out.println("t1");
	}

	public Cons2() {
		this(20);
		System.out.println("t2");
	}
	
	public Cons2(int a){
		super(20);
		System.out.println("t3");
	}
	
	public void n1() {
		System.out.println("n1");
	}
	
}
