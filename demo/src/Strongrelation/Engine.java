package Strongrelation;

public class Engine {

	public void typeofEngine() {  // method 
		System.out.println("v32");
	}
	
	public Engine() {   // constructor
		
	}
	
	public static void main(String[] args ) {
		   new Car(new Engine());     //object inside object 
	}
	
}

