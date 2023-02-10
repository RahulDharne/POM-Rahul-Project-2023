package Stringreverse;

public class Practicmethod {
	
	public static void main(String[] args ) {

		int a =141;
		int b = a;
		int rev = 0, rem;
		while(b!=0) {
		   rem = b%10;
		    rev= rev*10+rem;
		      b = b/10;
		}

		   if (a==rev) 
		   System.out.println(a +" is a palindrome number");
		  else
		  System.out.println(a + " is not a palindrome number");
		}
		
	}	
	
