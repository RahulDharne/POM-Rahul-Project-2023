package Practicesyn;

public class Test1 {

	public synchronized  void ShowTable(int a) {
		  for(int i=0;i<=10;i++) {
			  System.out.println(a*i);
			  try {
				  Thread.sleep(1000);
			  }
				  catch(InterruptedException e) {
					  System.out.println(e);
				  
			  }
		  }
	  }
}
