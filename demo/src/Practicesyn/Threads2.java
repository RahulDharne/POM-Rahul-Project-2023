package Practicesyn;

public class Threads2 {
	
	
	Test1 t;
	
	Threads2(Test1 t) {
		this.t = t;
	}
	    public void run() {
	    	t.ShowTable(5);
	    }
	  

}
