package practiceprogram;

public class Loops {
        
	 public static void main (String[] args ) {
		      System.out.println("0 to 100 even number using cntinue loops");
		      
		      for(int i =  0; i<=100; i++ ) {
		    	  if(i%2==1)
		    		  continue;
		    	  System.out.print(i + "\t");
		    		  
		      }
	 }
	      
}
