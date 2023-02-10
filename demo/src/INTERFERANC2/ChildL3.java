package INTERFERANC2;

public   class ChildL3 implements L1,L2 {

	@Override
	public void t1(int a) {
		// TODO Auto-generated method stub
		System.out.println(55);
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("logic f1");
	}

	@Override
	public void t1() {
		// TODO Auto-generated method stub
		System.out.println("t1 is non static");
		
	}

	@Override
	public void t2() {
		// TODO Auto-generated method stub
		System.out.println("t2 is lopp");
		
	}

	@Override
	public void t1(boolean c) {
		// TODO Auto-generated method stub
		System.out.println("logic failed");
		
	}

}
