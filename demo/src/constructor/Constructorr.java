package constructor;

public class Constructorr {
	
	 public Constructorr() {
		 this(true, 55);
			 System.out.println("Constructor with no arguments");
	 }
      public Constructorr(boolean x, int s) {
    	  this(55);
    	  System.out.println("Constructor with  boolean arguments");
    	  
      }
      
       public Constructorr( int k1) {
    	   System.out.println("3rs Constructor");
       }
       
      public static void main(String[] args) {
    	            new Constructorr();
    	            
      }
}
