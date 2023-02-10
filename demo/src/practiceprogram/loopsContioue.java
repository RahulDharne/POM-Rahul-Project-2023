package practiceprogram;

public class loopsContioue {
	
	public static void main(String[] args) {
		System.out.println("1 to 100 odd using contioue for loops");
		
		for(int i =  1; i<=100; i++ ) {
			if(i%2==0)
				continue;
			System.out.print(i + "\t");
		}
			
		
	}

}
