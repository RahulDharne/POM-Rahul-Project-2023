package Interface;

public abstract class Child implements  Parent ,Parent1 {

	@Override
	public void test1()  {
		// TODO Auto-generated method stub
		System.out.println("unlimited profit");
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		 System.out.println("loss");
	}

	@Override
	public void mutualFunds() {
		// TODO Auto-generated method stub
		System.out.println("LOGIC 1");
		
	}

	@Override
	public void goldinvestment() {
		// TODO Auto-generated method stub
		System.out.println("logic 2");
	}

	@Override
	public abstract void shares() ;
		
		
	

	@Override
	public abstract void options(); 
		
		
	

	@Override
	public abstract void exchange() ;
		
		
	}


	
	


