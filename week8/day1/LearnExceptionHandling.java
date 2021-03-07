package week8.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnExceptionHandling {
	
	public static int divide(int x, int y) {
		int z;
		if(x < y) {
			throw new ArithmeticException("first is smaller than second number. Please correct the input");
		}
		else {
			z = x / y;
		}
		
		return z;

	}
	

	public static void main(String[] args) throws FileNotFoundException {
		
		
		File file = new File("./data/test.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
	
		
		/*
		 * try { int result = divide(5,10); System.out.println(result); } catch
		 * (Exception e) { System.out.println(e); }
		 */
		
		
		
		
		
		
		
		/*
		 * int x = 10; int y = 0;
		 * 
		 * int[] num = { 10, 20 };
		 * 
		 * 
		 * try { System.out.println(x / y); } finally {
		 * System.out.println("finally code"); }
		 */

		/*
		 * try {
		 * 
		 * try { System.out.println(num[2]); } catch (ArrayIndexOutOfBoundsException e)
		 * { System.out.println(e); } int z = x / y; System.out.println(z); } catch
		 * (ArithmeticException e) { System.out.println(e); } catch (Exception e) {
		 * System.out.println(e); } finally { System.out.println("finally code"); }
		 */

		System.out.println("Last Line of my code");

	}

}
