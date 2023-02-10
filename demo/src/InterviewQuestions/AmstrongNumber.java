package InterviewQuestions;

public class AmstrongNumber {

	  public static void main(String[] args ) {
		  int a = 153; int remainder = 0; int result = 0;
		  int b = a;
		   while(b!=0) {
			   remainder = b%10;
			   result = (remainder*remainder*remainder) + result;
			    b=b/10;
		   }
		   
		   if(a==result)
			   System.out.println(a + " Is Amstronmg Number");
		   else
			   System.out.println(a + "Is not amstrong Number");
	  }
}
