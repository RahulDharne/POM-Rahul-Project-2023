package Arrays;

public class SorrtingArrys2 {
	
	         public static void main(String[] args ) {
	        	 
	         
		   int [] arry = {100,55,88,66,77255,755,7455,75};    // acending order > 
		   
		      int c;
		   for(int i = 0; i<arry.length; i++) {
			   
		   
			   for(int j = i+1;j<arry.length; j++)      {   //  j = 55 / i +1  
	   {
	              if(arry[i] > arry[j])   // 100 > 55  
	              {
	            	   c = arry[i];            // c=  100,
	            	   arry[i] = arry[j];      /// i =  55
	            	   arry[j] = c;              //  j = 100
	            	  
	              }
	              
	   }
	                	  
	                		 
			   }
			   System.out.print(arry[i]+ " ");  
		   }
	   }
}          
			   

	         
		   
	         