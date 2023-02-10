package Construtorinherit1;

public class childcon  extends parentcon {
	
	        public childcon(int a){        // always call parent class consctruorr first
	        	   super(true);
	        	System.out.println("child 1");
	        }
	        
	        public childcon() {
	        	System.out.println("child2");
	        }
	        public static void main(String[] args ) {
	        	          new childcon(25);
	        	           new  childcon();
	        }

}
