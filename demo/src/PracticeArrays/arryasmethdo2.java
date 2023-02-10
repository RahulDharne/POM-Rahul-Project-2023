package PracticeArrays;

public class arryasmethdo2 {

	   public static void b(int[] a ) {
		    int b = a[0];
		    
		    for(int i= 1; i<a.length;i++)
		    	
		    	if(b>a[i])
		         b= a[i];   // a[i] = 6 
		  System.out.println(b);
	   }  
		  public static void main(String[] args) {
			  int [] a = {12,558,556,6};
			    b(a);
			  
		  }
		    
		    
		   
		   
	   
}
