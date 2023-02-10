package Practiceexception;

public class Exeception3 {
	
	public static void main(String[] args ) throws InterruptedException {
			   
	  System.out.println(1);
	  try {
		  int a = 80, b= 0, c;
		  c=a/b;
		 System.out.println(c);
		 
		 System.out.println(2);
	  } 
		  catch(ArithmeticException ref) {
	  }
		       System.out.println("it can be didvide");
		   System.out.println(3);
		   Thread.sleep(5000);
		   System.out.println(4);
		   System.out.println("it wil executave");
	  }
	}