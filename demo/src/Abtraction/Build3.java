package Abtraction;

public class Build3 extends Build2{

	@Override
	void futureoption() {
		// TODO Auto-generated method stub
		 System.out.println("implemented2");
		
	}
	public static void main(String[] args ) {
		Build3 obj      =  new Build3();
		     obj.stockExchange();
		     obj.mutualfund();
		     obj.goldcoin();
		     obj.futureoption();
	}

}
