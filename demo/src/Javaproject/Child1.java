package Javaproject;

public abstract class Child1 implements L11,L22 {

	@Override
	public void t1(boolean c) {
		// TODO Auto-generated method stub
		System.out.println("it is overloading");
		
	}

	@Override
	public void g2() {
		// TODO Auto-generated method stub
		System.out.println("loss");
		
	}

	@Override
	public void L1() {
		// TODO Auto-generated method stub
		System.out.println("implemented");
		
	}

	@Override
	public void L2() {
		// TODO Auto-generated method stub
		System.out.println("won");
		
	}

	@Override
	public void t1(int a) {
		// TODO Auto-generated method stub
		System.out.println("profit");
	}

	@Override
	public void g1() {
		// TODO Auto-generated method stub
		System.out.println("g1 with no arguments");
		
	}
        abstract  void shares();
}
