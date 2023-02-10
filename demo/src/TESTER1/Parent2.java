package TESTER1;

public class Parent2 {
	
	public void t1() {
		System.out.println("t1 without arguments");
	}
	
	public void t1(int a) {
		System.out.println("t1 with arguments ");
	}
     public static void main(String[] args ) {
    	 Parent2 obj  = new Parent2();
    	        obj.t1();
    	        obj.t1(95);
     }
	
}
