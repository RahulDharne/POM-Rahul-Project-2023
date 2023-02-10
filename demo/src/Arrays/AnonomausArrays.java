package Arrays;

public class AnonomausArrays {
	
	public static void m1(int [] a) {
		for(int i =0;i<a.length;i++)
			System.out.println(a [i]);
	}
     public static void main(String[] args ) {
                                                                    	// int [] a = {11,22,33,44,55 };
    	m1(new int[] {11,22,33,44,55 });                          //   arrays passing without decalration   we need on method //
    	                                                         // m1(a);
     } 
}
//int [] b = {11,22,33,44};

	//public static void m1(int []a ) {
	//	for(int i = 0;i<a.length;i++) {
		//	System.out.println(a[i]);
		///}
	//}
		//public static void m2() {
		//	Alllopps obj	     = new Alllopps();
		//	m1(obj.b);
			
	
		
	
		//public static void main(String[] args ) {
		//	m1(new int [] {11,32,88,96,45});
		//
			//m2();
			
		//}
	//}