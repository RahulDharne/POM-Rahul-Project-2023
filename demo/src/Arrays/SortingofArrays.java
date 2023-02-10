package Arrays;

public class SortingofArrays {

	public static void main(String[] args ) {
		    int [] a =	{200,55,88,878,66699,445,755,744,74,74,5,5}; 
		    
		    // ACENDING order 
		   int c;
		   for(int i =0;i < a.length; i++)                          //  200
		   {
			   for(int j = i+1;j<a.length;j++)                       // 55
			   {	 
				   if(a[i] > a[j]) {                        //            i= 200 > j =55
				    c  = a[i];                                  //  c = 200;
				    a[i] = a[j];                     //          j = 200;   i = 55// a[i] = 55
				    a[j] = c ;                                      // a[j] = 200
			   }
				    
			   
			   
		   }   
		   
			   System.out.print(a[i]+ " ");
	}
	
	}
}
	   
		   
	

