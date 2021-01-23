package week2.day1;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		/*
		 * int x = 10; int y = 20;
		 */
		
		int[] values = new int[3]; //0,1,2
		
		values[0] = 20; // index starts with 0
		values[1] = 10;
		values[2] = 30;  // last data index should be size - 1
		
		
		//to sort the array values in ascending order
		Arrays.sort(values);
		
		// for(datatype tempVariable : source)
		for(int  eachValue : values) {
			
			System.out.println(eachValue);
			
		}
		
		
		
		/*
		 * for (int i =values.length - 1; i >= 0; i--) {
		 * 
		 * System.out.println(values[i]);
		 * 
		 * }
		 */
		
		//System.out.println(values[2]);
		
		//int[] values = {10, 20, 30, 40};
		//System.out.println(values.length);
		
		//System.out.println(values[3]);
		
		//int len = values.length;
		
		//System.out.println(values[values.length-1]);
		
	}

}
