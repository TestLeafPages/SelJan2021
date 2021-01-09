package week1.day1;

public class Calculator {

	public int add(int num1, int num2) {
		int sum = num1 + num2;

		return sum;
	}

	public double sub(double num1, double num2) {
		double result = num1 - num2;

		return result;

	}

	public double mul(double num1, double num2) {
		double result = num1 * num2;

		return result;
	}

	public int divide(int num1, int num2) {
		int result = num1 / num2;

		return result;

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println(calc.add(10, 20));
		System.out.println(calc.sub(35.12, 10.45));
		System.out.println(calc.mul(45.67, 55));
		System.out.println(calc.divide(40, 10));

	}

}
