package Arrays;

public class JaggedArrys {
	
	public static void main(String[] args ) {
		
		int[] [] a = new int [4][];
		
		a[0] = new int [] {11};
		a[1] =  new int [] {22,33,44};
		a[2] =new int []  {55,66,77,88,99};
	    a[3] = new int [] {13,14,15,16,17,18};
		   
 		for(int i = 0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				 System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
