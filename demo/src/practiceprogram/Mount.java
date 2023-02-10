package practiceprogram;

public class Mount {
	
	   int maths;
	   int  phys;
	   int chemistry;
	   
	    
	  public void rahul() {
		   maths = 56;
		   phys  = 60;
		   chemistry = 50;
		   
		    System.out.println("Marks of student:");
		    System.out.println(" maths " + maths);
		    System.out.println(" phys "+ phys);
		    System.out.println(" chemistry "+ chemistry);
		    System.out.println("");
	 	     }
	    
	  public void sonu() {
		   maths = 46;
		   phys  = 70;
		   chemistry = 80;
		   
		    System.out.println("Marks of student:");
		    System.out.println(" maths " + maths);
		    System.out.println(" phys " + phys);
		    System.out.println(" chemistry "+chemistry);
		    
	  }
		    
	  
	  
	  
	  public static void main(String[] args ) {
		  Mount obj        = new Mount();
		     obj.rahul();
		     obj.sonu();
	  }
      

}
