package Stringreverse;

public class PalindromeString {

	   public static void main(String[] args ) {
		   
		   String a = "rahul";
		   
		   String b = "";
		// for(int i= a.length()-1;i>=0;i--) 
			                                      for(int i=0;i<a.length();i++)
		       b  = b+ a.charAt(i) ;
		  
		   System.out.println(b);
	   
	   
	   if(a.equals(b))
	   
	   System.out.println("palindrome string");
	   
	   
	 else
	     
		   System.out.println("not a palidrome string");
}

}