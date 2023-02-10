package RevisionLoops;

public class Applo2  {
	
	 public void vote(int vote) {
		  if(vote<18)
			  throw new IllegalArgumentException("Is eleiglbel for notvote");
		  else 
			  System.out.println("is eligble for vote");
	 }
	 
             public static void main(String[] args ) {
            	 Applo2 obj    = new Applo2();
            	 try {
            	 obj.vote(17);
            	 }
            	 catch(IllegalArgumentException ref) {
            		 System.out.println(ref.getMessage());
            	 }
            	 obj.vote(22);
            	 
             }
}