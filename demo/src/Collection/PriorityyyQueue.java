package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityyyQueue {
	
	public static void main(String[] args ) {
		PriorityQueue<String>   q =  new PriorityQueue<String>();
		
		         q.add("Mango");
		         q.add("graopes");
		         q.add("Jackfruits");    // randomly it can come anything //capitalletter
		         q.add("Apple"); 
		        
		         
		         System.out.println("Head:" + q.element());  // head need to be select head
		         System.out.println("Head:"+ q.peek());
		         
		           //   Iterator i  = q .iterator();
		            // while(i.hasNext()) {
		            //	   System.out.println(i.next());
		              //  }
		               q.remove();
		                 System.out.println("Head:" + q.element());  
		                 
		                q.poll();   // head wil  get reomove 
		                Iterator i2 = q.iterator();
		                while(i2.hasNext()) {
		                  System.out.println(i2.next());
		                  
	}
		                 
}	                 
}


