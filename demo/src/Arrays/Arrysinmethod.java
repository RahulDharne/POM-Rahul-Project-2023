package Arrays;

public class Arrysinmethod {
	
	public static void m1(int[] a ) {
		int m1 = a[0];          // m1 = 33
		for (int i =1;i<a.length;i++)    // ityeration start from 3 
			
			if(m1 > a[i])             //   33>3,3>4,3>5,3>1        // 
		        m1= a[i];           // 
		
		System.out.println(m1);
	}
	
	public static void main(String[] args ) {
		int[] a = {33,3,4,5,1 };        // arrys has declared in main method  //0=33,1=3,2=4,3=5,4=1
		m1(a);
		}
	}


