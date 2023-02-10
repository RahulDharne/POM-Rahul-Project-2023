package operators;

public class ArthmeticOperator {
	
	public static void main(String[] args ) {
		int  a = 45;
		int c ;
		int b;
		 System.out.println(a);
		 ++a;
		 System.out.println(a);
		 b= a++;
		 System.out.println(b);
		 c=(--a)+(b--);
		 System.out.println(c);
		 
		 int d =(--c)-(a++);
		 System.out.println(d);
		 
		 int e=c*d;
		 System.out.println(e);
		 
		 int f=c/d;
		 System.out.println(f);
		 
		 
		 int g=c%d;
		 System.out.println(g);
		 
		  if((g>2)&&(e<4000))  {
			  System.out.println("it is a logical operator  &&");
			  
		  }else if ((a<b)||(f<g)) {
			  System.out.println("it is logical operator ||");
		  }else if (!(c==92)&&(g==1)) {
			  System.out.println("it is equal and not equal operators");
		  }else  {
			  System.out.println("none of above condition is true");
			  
		  }
		   
		       
	   }

}
