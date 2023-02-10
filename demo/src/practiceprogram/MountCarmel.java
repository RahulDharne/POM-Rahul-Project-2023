package practiceprogram;

public class MountCarmel {
	
	int maths;
	int physics;
	int chemistry;
	
	
	public void Rahul()  {
	   maths = 85;
	   physics= 75;
	   chemistry= 83;
	   System.out.println("Marks of student");
	   System.out.println("maths" + maths);
	   System.out.println("physics" + physics);
	   System.out.println("chemistry" + chemistry);
	   System.out.println("");
	   System.out.println(maths+physics+chemistry);
	   
	}
	
	
	
	public void sunny()  {
		   maths = 88;
		   physics= 79;
		   chemistry= 73;
		   System.out.println("Marks of student");
		   System.out.println("maths" + maths);
		   System.out.println("physics" + physics);
		   System.out.println("chemistry" + chemistry);
		   System.out.println(maths+physics+chemistry);
		}
	
	
	public static void main(String[] args ) {
		MountCarmel obj= new MountCarmel();
		obj.Rahul();
		obj.sunny();
	}
	
}


