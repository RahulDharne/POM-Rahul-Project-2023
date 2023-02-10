package praticsemethods;

public class nonstaticmethods {
	
	 public void demo() {
		  System.out.println("demo is non static method");
	 }
      public static void main(String[] args ) {
    	  nonstaticmethods obj         = new nonstaticmethods();
    	  obj.demo();
      }
}
