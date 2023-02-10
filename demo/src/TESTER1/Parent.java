package TESTER1;

public class Parent {
	
	public void login() {
		System.out.println("t1 without arguments ");
		
	}
	
	 public void login(String Username , String Password) {
		System.out.println("t1 with argumnts");
	}
	
	public static void main(String[] args ) {
		Parent obj      = new Parent();
		   obj. login();
		   obj.login("rahul","rahul12");
	}
}