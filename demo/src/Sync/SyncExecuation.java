package Sync;

public class SyncExecuation {

	
	  public static void main(String[] args ) {
		       Velocity obj = new Velocity();
		       
		       VelocityThreads t1 = new VelocityThreads(obj);  //  it wil take time after 2sec wil [print rahul amd slp 
		      VelocityTheards2 t2 = new VelocityTheards2(obj);  // but i start 2 nd method
		        t1.start();
		        t2.run();       // if method is not synchronizaed then data wil occur irreguler multipl ethread try to access same object
	  }
}                // after synchrinized it wil start method t2 because we synchronized that method it wil run systemic way
                   