package argumentsandreturntypes;

public class WithArgumentsAndWithReturns {
	
	public int m1(double a) {
		return 60;
			
	}

	  public static boolean m2(char a)  {
		  return true;		  
	 }
         public static void main(String[] args) {
        	 WithArgumentsAndWithReturns obj= new WithArgumentsAndWithReturns();
        	   int d = obj.m1(6.0);
        	     System.out.println(d);
        	     m2('a');
        	      System.out.println(m2('a'));
         }
         
}




