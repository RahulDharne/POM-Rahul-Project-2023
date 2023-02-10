package Exception;

public class Testcase1 {

	  public  void totalMarks(int marks) {
		  if(marks<40) 
			     throw new IllegalArgumentException("Failed");
		  else
			  System.out.println("Passed");
		
	}
	  public static void main(String[] args) {
		    Testcase1 obj  = new Testcase1();
		    try
		    {
		    	obj.totalMarks(23);
		    }
		    catch(IllegalArgumentException obj1) {    // here put refrenc variable eg. obj1
		    	   System.out.println(obj1.getMessage());   // REFERANCE VARIBALE.getMessage
		    
		    
		    	
		    }
		    obj.totalMarks(50);
		  
	  }
	
}
