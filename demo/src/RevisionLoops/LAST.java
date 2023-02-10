package RevisionLoops;

public class LAST  extends  Alllopps {

	
	   public void m3() {
		   System.out.println("m3 in child class");
		      
		           
	   }
	     public static void main(String[] args ) {
	     Alllopps OBJ = new  LAST();
	     
	           LAST OBJ1 = (LAST) OBJ;
	              OBJ.m1();
	              OBJ.m2();
	              OBJ1.m3();
	     }
}
	    	     