package Sync;

public class Velocity {

	 public synchronized void automation(String faculty) {          // faculty name wil print , with synchronization
		 for(int i = 0;i<10;i++) {
			 System.out.println("java "+ faculty);
			 try {
			     Thread.sleep(2000);
			 }
			 catch(InterruptedException e) {
			 System.out.println("handled");
					 
		 }
	 }
	 }
}
