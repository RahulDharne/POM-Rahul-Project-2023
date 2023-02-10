package PracticeArrays;

public class ArryasinMethod {

	public static void g(int [] a) {
		int g = a[0];            // g = 20, g = 56,g= 89,g= 256,g = 456
				
		for(int i= 1;i<a.length;i++)  // i=1 ,i= 2, i = 3 i = 4 // till max value inn arrays range in bound
			if(g < a[i])      // a[i]=56  //  456< 25  // smallet number to print we need  > or if we want print biggest number we ned <
			g =a[i];     // g = 256

			System.out.println(g);
	}					
	
	public static void main(String[] args) {
		int [] a = {20,56,89,256,458,25};   // 0,1,2,3,4,5,6// 
		g(a);
									
		
	}
}
	

