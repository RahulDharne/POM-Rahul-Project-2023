package Practicesyn;

public class Syncexecution {

	  public static void main(String[] args ) {
		    Test1 obj =  new Test1();
		    
		    Thread1 t1 = new Thread1(obj); 
		    Threads2 t2 = new Threads2(obj);
		    t1.start();
		    t2.run();
	  }
}
