package special.session;

public class Factorial {

	public static void main(String[] args) {
		//declare the input
		int input = 5;
		
		//declare the result with initial value
		int fact = 1;
		
		//set up the for loop
		for (int i = 1; i <= input ; i++) {
			
			fact = fact * i;
			
		}
		
		System.out.println(fact);
		
		

	}

}
