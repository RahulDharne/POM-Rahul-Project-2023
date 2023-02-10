package Exception;

public class Example4 {

	   public static void main(String[] args) throws InterruptedException {
		        int a = 20;
		        int b = 20;
		        int c = a +b;
		        Thread.sleep(2000);
		        System.out.println(c);
		        Thread.sleep(2000);
		        int d = c+a;
		        System.out.println(d);
		        System.out.println("next line");
		        Thread.sleep(2000);
		        int e= c*d;
		         System.out.println(e);
	   }
}
