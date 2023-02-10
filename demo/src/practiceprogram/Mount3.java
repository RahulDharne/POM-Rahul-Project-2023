package practiceprogram;

public class Mount3 {

	
	  public Mount3(int maths, int phys, int chemistry,String name) {
		 
	 
    	  System.out.println(name);
    	  System.out.println("math:"+ maths);
    	  System.out.println("phys:"+ phys);
    	  System.out.println("chemistry:"+ chemistry);
    	 System.out.println();
      }
      
      public static void main(String[] args ) {
    	  Mount3 rahul     = new Mount3(80,56,96,"rahul");
    	  Mount3 raju     = new Mount3(80,56,96,"raju");
    	  Mount3 viky     = new Mount3(80,56,96,"viky");
      }
}
