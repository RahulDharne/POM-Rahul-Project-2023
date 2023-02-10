package Sync;

public class VelocityThreads  extends Thread{
	
	Velocity faculty;           // int a
	                                       // we extends with  java Thread
	      VelocityThreads(Velocity faculty) {        // constructorr with argument
		this.faculty = faculty;         // this.a=a;
	}
	
        public void run() {            //  whenevr we use thread class at that time we need to use run method
        	faculty.automation("Rahul");     // a.automation(rah)
        }
}
