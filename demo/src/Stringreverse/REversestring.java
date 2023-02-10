package Stringreverse;

public class REversestring {
	
	
	public static void main(String[] args ) {
		String a = "polymorphism";  // 0=m,
		String b = "";       // emty string
		 for(int i=a.length()-1; i>=0; i--)
		           b = b + a.charAt(i);    // chatAt(index)
		           System.out.println(b);
		 
	}

}


