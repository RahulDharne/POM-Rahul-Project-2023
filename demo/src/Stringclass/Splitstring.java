package Stringclass;

public class Splitstring {
          
	
	 public static void main(String[] args ) {
		 String a= "Rahul gandhi won election in 2024";
		         String [] b = a.split("\\s");
		         
		          for(String c:b)
		            System.out.println(c);
	 }
	 }