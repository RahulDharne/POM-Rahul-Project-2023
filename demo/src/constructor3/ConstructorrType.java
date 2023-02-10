package constructor3;

public class ConstructorrType {
         
             public ConstructorrType(boolean x , int a ,String c) {	
            	     System.out.println("with parameterized constructorr");
            	     
             }
             
             public ConstructorrType() {
            	      System.out.println("with parameterless constructor");
             }
             
             public ConstructorrType(int a) {
            	 System.out.println("Defalt constructorr");
             }
             
	    public static void main(String[] args ) {
                     new ConstructorrType(true, 60, "Rahul" );
                     new ConstructorrType(0);
                     
	    	           
	    }
}          
