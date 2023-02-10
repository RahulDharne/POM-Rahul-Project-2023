package constructorinhertance;

public class ChildClass extends ParentCons {

	
	public ChildClass(int b) {  //child constructor wil always call parent constructor in all case
		super(true);
		System.out.println("child constructor");
		
		
	}
	public static void main(String[] args ) {
		      new ChildClass(20);
	}
}
