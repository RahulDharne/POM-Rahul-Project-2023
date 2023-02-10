package Stringreverse;

public class Reversbystring {
	
	public static void main(String[] args ) {
		String a = "RAHUL";
		String rev = "";
		for(int i = a.length()-1;i>=0;i--)  // we take -1 becaue we take i>=0 that ya 
		   rev  = rev + a.charAt(i);
		System.out.println(rev);
		//for(int i =0;i<a.length();i++)
			//    rev  = rev +a.charAt(i);
		   //   System.out.println(rev);
	}

}
