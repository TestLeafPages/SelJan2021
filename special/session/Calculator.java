package special.session;

public class Calculator {
	
	int num1=10;
	
	
	public void add() {
		
		num1 = 20;
		System.out.println(num1);
	}
	
	public void sub() {
		
		System.out.println(num1);
		
	}

	/*
	 * public static void calculation() {
	 * 
	 * System.out.println(10 + 20); System.out.println(20 - 10);
	 * System.out.println(10 * 20); System.out.println(20 / 10);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		
		calc.sub();
		
		calc.add();
		

		//Calculator.calculation();
	}

}
