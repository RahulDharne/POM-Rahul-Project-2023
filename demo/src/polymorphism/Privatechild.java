package polymorphism;

public class Privatechild extends Privatetestcase {
	
	 public static void main(String[] args) {
		 Privatechild obj  = new  Privatechild();
		 obj.setvar(10);
		 int ref = obj.getvar();
		 System.out.println(ref);
	 }

}
