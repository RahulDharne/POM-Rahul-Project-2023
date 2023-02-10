package Arrays;

public class Dupalarrys {
	
	public static void main(String[] args ) {
		   int [] a = {1,1,88,11,225,11,55,88 ,225}; // double euqal wil print 
		   
		   for(int i =0; i<a.length; i++) {
		   
		   for(int j =i+1;j<a.length;j++) {               /// beacuse i = 0, j = 0+1; (1,1);
		         if(a[i]==a[j])                    // ,without duplicate value 
		        	 System.out.print(a[j] +" \t");
   }           
		   
	}

}

}