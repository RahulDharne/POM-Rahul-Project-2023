package Exception;

public class Testcase2 {
	
	   public static void main(String[] args) throws ArithmeticException, InterruptedException {
		   System.out.println(1);
		   Thread.sleep(2000);
		   System.out.println(2);
		   System.out.println(3);
		   try
		   {
		   System.out.println(100/0);   // exception
		   }
		   catch(ArithmeticException ref) {
			   System.out.println(ref.getMessage());   //  when it exception came use catch method
		   }
		   System.out.println(4);
		   Thread.sleep(5000);       // only example taken
		   System.out.println(5);
		   System.out.println(6);
	   }

}
