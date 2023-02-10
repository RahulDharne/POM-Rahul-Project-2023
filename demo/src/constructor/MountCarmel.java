package constructor;

public class MountCarmel {
	
	  public MountCarmel(int Maths, int Phys, int Chemistry, String name) {
		  
		  System.out.println("Student Name:"+ name);
		  System.out.println("Maths" + Maths);
		  System.out.println("Phys" + Phys);
		  System.out.println("Chemistrty" + Chemistry);
		  int total = Maths+Phys+Chemistry;
		  System.out.println("Total " +  total);
		   System.out.println();
	  }
       
	   public static void main(String[] args ) {
		   MountCarmel Rahul    = new MountCarmel(85,65,74, "Rahul");
		   MountCarmel Virat    = new MountCarmel(85,69,79, "Virat");
		   MountCarmel Rohit    = new MountCarmel(95,95,64, "Rohit");
		   
		  
		   
		   
	   }
}
