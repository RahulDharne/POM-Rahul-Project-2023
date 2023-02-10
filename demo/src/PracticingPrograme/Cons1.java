package PracticingPrograme;

public class Cons1 {

	
	 public void m1() {
		 System.out.println("m1");
	 }
	 
	 public void m2() {
		 System.out.println("m2");
	 }
	 
	 public Cons1() {
		 System.out.println("m3");
		 
	 }
	 public Cons1(boolean c) {
		 this();
		 System.out.println("m4");
	 }
	 
	 public Cons1(int a) {
		 this(true);
		 System.out.println("m5");
	 }
}
