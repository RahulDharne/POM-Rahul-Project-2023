package practicesvariables;

public class Palindeomearrays {

	public static void main(String[] args ) {
	      
		String a = "NitiN";
		String b = "";
		
		for(int i = a.length()-1;i>=0;i--) 
			b   = b +a.charAt(i);
			
			System.out.println(b);
			System.out.println(a.equals(b));
		
			if(a.equals(b))
				System.out.println(b+ " Is ia palindrome string");
			else
				System.out.println(b + " is not a palindrome string");
		
	}

}