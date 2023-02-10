package Stringreverse;

public class NormalPlaindrome {
	
	public static void main(String[] args ) {
		
		int a = 121;      // simple no we take
		int b = a;              // we stored in in b becaue orignal number shuld stored
		int rev = 0,rem;        // we need to reverse
		while(b!=0) {            // 121!=0
			
			rem= b%10;         // rem = 121/10= 1   , 12%10= 2, 1%10=1
			rev=rev*10+rem;      // rev = 0*10+1= 1   , 1*10+2=12 ,  12*10+1
			b= b/10;           // b = 121/10= 12      // condtion fail agin we start from while loop. 12/10= 1
		} 
			
		if(a==rev) {
			System.out.println(a+" is a palindrome number");
			
		}
		else
			System.out.println(a+" is not a palindrome number");
	}

}

