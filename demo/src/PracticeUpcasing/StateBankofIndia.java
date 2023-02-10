package PracticeUpcasing;

public class StateBankofIndia {
	
	void bankHeadOffice() {
		System.out.println("State Bank of india Headoffice  = Mumbai");   // parent class
	
	}

}

class StateBankofMysore extends  StateBankofIndia{
	
	void bankHeadoffice() {
		System.out.println("State Bank of Mysore Headoffice  = Mysore");  // child class
	}

}

class StateBankofPatila extends StateBankofIndia {
    //    @overide
	void bankHeadoffice() {
		   System.out.println("State Bank of patila Headoffice  = patila");
	   }
}

class Bank {
	 void printMethod( StateBankofIndia obj) {        // nonstatic method parametirized with refrnce
	 
		  obj.bankHeadOffice();                   // all 3 method matches its is overide method banke
}
	 
	 public static void main(String[] args ) {
		 Bank obj = new Bank();
		 StateBankofIndia obj1 = new  StateBankofMysore();
		 
		 obj.printMethod(obj1);
	 }
}