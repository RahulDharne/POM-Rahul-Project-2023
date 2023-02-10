package Practicesyn;

public class Thread1   extends Thread{
	
	    Test1 t;

	       Thread1 (Test1 t) {
	    	   this.t  = t;
	       }
	       
	       public void run() {
	    	   t.ShowTable(2);
	    	  
	       }
	       
}
